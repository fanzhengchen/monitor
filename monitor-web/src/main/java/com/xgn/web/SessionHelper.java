package com.xgn.web;

import com.xgn.model.BeginSession;
import com.xgn.model.DeviceInfo;
import com.xgn.model.Event;
import com.xgn.model.Session;
import com.xgn.web.request.Metric;
import com.xgn.web.request.SessionBase;
import com.xgn.web.request.SessionData;

import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-13
 * Time: 6:14 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
public class SessionHelper {

    private static final String KEY = "key";
    private static final String SUM = "sum";
    private static final String COUNT = "count";
    private static final String TIMESTAMP = "timestamp";
    private static final String DUR = "dur";

    private static final String HTTP_LINK = "httpLink";
    private static final String CLY_VIEW = "[CLY]_view";
    private static final String EVENT = "event11";

    private static <T> T convertFrom(Map<String, ?> event, String key, Class<T> clazz) {
        try {
            Object value = event.get(key);
            if (value instanceof Integer) {
                return (T) (Long.valueOf(value.toString()));
            }
            return (T) value;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return null;
        }

    }


    public static Event buildFrom(Map<String, ?> rawEvent, long id) {
        return Event.builder()
                .sessionId(id)
                .count(convertFrom(rawEvent, COUNT, Long.class))
                .dur(convertFrom(rawEvent, DUR, Long.class))
                .key(convertFrom(rawEvent, KEY, String.class))
                .sum(convertFrom(rawEvent, SUM, Long.class))
                .build();
    }

    public static Session buildFrom(SessionBase req) {
        return Session.builder()
                .appKey(req.getAppKey())
                .deviceId(req.getDeviceId())
                .sdkVersion(req.getSdkVersion())
                .timestamp(new Date(Long.parseLong(req.getTimestamp())))
                .build();
    }

    public static DeviceInfo buildFrom(long id, SessionData sessionData) {
        return DeviceInfo.builder()
                .sessionId(id)
                .aav(sessionData.getAav())
                .av(sessionData.getAv())
                .ca(sessionData.getCa())
                .city(sessionData.getCity())
                .de(sessionData.getDe())
                .p(sessionData.getP())
                .uid(sessionData.getUid())
                .sav(sessionData.getSav())
                .build();
    }


    public static BeginSession buildFrom(long id, Metric metric) {
        return BeginSession.builder()
                .sessionId(id)
                .appVersion(metric.getAppVersion())
                .density(metric.getDensity())
                .device(metric.getDevice())
                .locale(metric.getLocale())
                .os(metric.getOs())
                .resolution(metric.getResolution())
                .osVersion(metric.getOsVersion())
                .build();
    }

}
