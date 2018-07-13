package com.xgn.web.request;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 4:52 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
//{"ca":"","pv":"11.2","p":"iOS","uid":"9979F78E-A15F-4D9C-9C81-BB0ADC3B3BB2","av":"1.0","de":"Simulator","aav":"","cty":"杭州","sav":"2.0.0"},
@Data
public class SessionData {
    private String ca;
    private String pv;
    private String p;
    private String uid;
    private String av;
    private String de;
    private String aav;
    private String city;
    //版本号
    private String sav;
}
