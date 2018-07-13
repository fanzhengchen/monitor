package com.xgn.service;

import com.xgn.web.request.SessionBeginReq;
import com.xgn.web.request.SessionDataReq;
import com.xgn.web.request.SessionDurReq;
import com.xgn.web.request.SessionEndReq;
import com.xgn.web.response.BaseResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 5:36 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
public interface SessionService {


    /**
     * 处理 session 上传的 data数据，包含 events
     *
     * @param req
     * @return
     */
    BaseResponse handleSessionData(SessionDataReq req);

    /**
     * 处理 session 结束
     *
     * @param req
     * @return
     */
    BaseResponse handleSessionEnd(SessionEndReq req);

    /**
     * 处理session 开始
     *
     * @param req
     * @return
     */
    BaseResponse handleSessionBegin(SessionBeginReq req);

    /**
     * 处理session dur
     *
     * @param req
     * @return
     */
    BaseResponse handleSessionDur(SessionDurReq req);
}