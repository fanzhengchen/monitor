package com.xgn.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-13
 * Time: 9:37 AM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class SessionDurReq extends SessionBase {
    @JsonProperty("session_duration")
    private String sessionDuration;
}
