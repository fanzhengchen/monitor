package com.xgn.web.controller;

import com.xgn.web.request.SessionBeginReq;
import com.xgn.web.request.SessionDataReq;
import com.xgn.web.request.SessionDurReq;
import com.xgn.web.request.SessionEndReq;
import com.xgn.web.response.BaseResponse;
import com.xgn.service.SessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 4:21 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/monitor/session")
public class SessionController {

    @Autowired
    SessionService sessionService;

    @PostMapping("/data")
    public BaseResponse sessionData(@Validated @RequestBody SessionDataReq req) throws Exception {


        return sessionService.handleSessionData(req);
    }

    @PostMapping("/duration")
    public BaseResponse sessionDur(@RequestBody SessionDurReq req) {
        return sessionService.handleSessionDur(req);
    }


    @PostMapping("/begin")
    public BaseResponse sessionBegin(@RequestBody SessionBeginReq req) {
        return sessionService.handleSessionBegin(req);
    }

    @PostMapping("/end")
    public BaseResponse sessionEnd(@RequestBody SessionEndReq req) {
        return sessionService.handleSessionEnd(req);
    }
}
