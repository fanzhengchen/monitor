package com.xgn.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

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
public class SessionBase {

    @JsonProperty("app_key")
    private String appKey;

    @JsonProperty("device_id")
    private String deviceId;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("sdk_version")
    private String sdkVersion;
}
