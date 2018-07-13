package com.xgn.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 4:11 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Data
@ToString(callSuper = true)
public class SessionDataReq extends SessionBase {

    @JsonProperty("c")
    private SessionData sessionData;

    private List<Map<String,Object>> events;


}
