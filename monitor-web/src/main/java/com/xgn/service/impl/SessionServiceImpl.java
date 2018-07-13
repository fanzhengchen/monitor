package com.xgn.service.impl;

import com.xgn.mapper.BeginSessionMapper;
import com.xgn.mapper.DeviceInfoMapper;
import com.xgn.mapper.EventMapper;
import com.xgn.mapper.SessionMapper;
import com.xgn.model.BeginSession;
import com.xgn.model.DeviceInfo;
import com.xgn.model.Event;
import com.xgn.model.Session;
import com.xgn.web.SessionHelper;
import com.xgn.web.request.*;
import com.xgn.web.response.BaseResponse;
import com.xgn.service.SessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 5:37 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */

@Slf4j
@Service
public class SessionServiceImpl implements SessionService {

    /**
     * 用来记录某个线程里处理的 session_id 因为一次性会处理完，所以这里直接用ThreadLocal
     */
    private static final ThreadLocal<Long> sessionIds = new ThreadLocal<>();



    @Resource
    SessionMapper sessionMapper;

    @Resource
    EventMapper eventMapper;

    @Resource
    DeviceInfoMapper deviceInfoMapper;

    @Resource
    BeginSessionMapper beginSessionMapper;


    @Override
    public BaseResponse handleSessionData(
            @NotNull(message = "session 数据不能为空") SessionDataReq req) {

        log.info("session data req {}", req);
        Session session = SessionHelper.buildFrom(req);
        sessionMapper.save(session);
        long id = session.getSessionId();
        log.info("last insert id {}", id);

        deviceInfoMapper.insert(SessionHelper.buildFrom(id, req.getSessionData()));


        sessionIds.set(id);
        req.getEvents().parallelStream()
                .forEach(event -> saveEvent(event, id));

        return BaseResponse.ok();
    }


    @Override
    public BaseResponse handleSessionBegin(SessionBeginReq req) {
        Session session = SessionHelper.buildFrom(req);
        sessionMapper.save(session);
        long id = session.getSessionId();
        BeginSession beginSession = SessionHelper.buildFrom(id, req.getMetric());

        beginSessionMapper.save(beginSession);

        return BaseResponse.ok();
    }

    @Override
    public BaseResponse handleSessionEnd(SessionEndReq req) {
        return BaseResponse.ok();
    }

    @Override
    public BaseResponse handleSessionDur(SessionDurReq req) {
        log.info("dur req {}", req);
        Session session = SessionHelper.buildFrom(req);
        sessionMapper.save(session);

        long id = session.getSessionId();


        return BaseResponse.ok();
    }

    private void saveEvent(Map<String, Object> rawEvent, long id) {
        Event event = SessionHelper.buildFrom(rawEvent, id);
        eventMapper.save(event);
        String key = (String) event.getKey();

    }




}
