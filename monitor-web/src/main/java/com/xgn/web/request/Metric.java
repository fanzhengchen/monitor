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
public class Metric {
    @JsonProperty("_device")
    private String device;
    @JsonProperty("_os_version")
    private String osVersion;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("_density")
    private String density;
    @JsonProperty("_app_version")
    private String appVersion;
    @JsonProperty("_resolution")
    private String resolution;
    @JsonProperty("_os")
    private String os;
}
