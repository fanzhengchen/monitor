package com.xgn.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-13
 * Time: 9:24 AM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Data
public class SessionBeginReq extends SessionBase {
    @JsonProperty("metrics")
    private Metric metric;
}
