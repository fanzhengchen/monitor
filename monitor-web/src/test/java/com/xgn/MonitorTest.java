package com.xgn;

import com.xgn.mapper.BeginSessionMapper;
import com.xgn.mapper.DurationSessionMapper;
import com.xgn.mapper.SessionMapper;
import com.xgn.model.BeginSession;
import com.xgn.model.DurationSession;
import com.xgn.model.Session;
import com.xgn.web.SessionHelper;
import com.xgn.web.request.Metric;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 12:13 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Slf4j
@SpringBootTest(classes = {MonitorApplication.class})
@AutoConfigureMockMvc
@WebAppConfiguration
@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-dev.properties")
public class MonitorTest {


    @Autowired
    MockMvc mockMvc;

    @Autowired
    SessionMapper sessionMapper;

    @Autowired
    BeginSessionMapper beginSessionMapper;

    @Autowired
    DurationSessionMapper durationSessionMapper;

    @Before
    public void before() {
        log.info("before mockMvc {}", mockMvc);
    }

    @Test
    public void testMybatisInsertion() {
        Session session =
                Session.builder()
                        .sdkVersion("1.1")
                        .deviceId("abc")
                        .appKey("abcd")
                        .timestamp(new Date(System.currentTimeMillis()))
                        .build();
        sessionMapper.save(session);
        log.info("aa {}", session.getSessionId());

    }

    @Test
    public void testHomePage() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders
                .get("http://localhost:17263/")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        MvcResult result = mockMvc.perform(request).andReturn();

        MockHttpServletResponse response = result.getResponse();

        Assert.assertEquals(response.getStatus(), 200);
        log.info("home page response {}", response.getContentAsString());
    }

    @Test
    public void testSaveBeginSession() {
        Metric metric = new Metric();
        metric.setAppVersion("1");
        metric.setDensity("2");
        metric.setDevice("3");
        metric.setLocale("4");
        metric.setOs("5");
        metric.setOsVersion("^");
        metric.setResolution("7");

        BeginSession beginSession = SessionHelper.buildFrom(1, metric);
        beginSessionMapper.save(beginSession);

        log.info("begin session save {}", beginSession);

    }

    @Test
    public void testSaveDurSession() {



    }
}
