package com.springgears.events.listener.contextrefreshed;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationStartedEventListener2 {

    @Order(2)
    @EventListener
    public void onApplicationContextRefreshed(ContextRefreshedEvent event) {
        log.info("2. Application started successfully: " + event);
    }
}
