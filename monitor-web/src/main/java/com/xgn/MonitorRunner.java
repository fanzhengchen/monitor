package com.xgn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-13
 * Time: 1:42 AM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Slf4j
@Component
public class MonitorRunner implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            log.info("bean {}", name);
        }
    }
}
