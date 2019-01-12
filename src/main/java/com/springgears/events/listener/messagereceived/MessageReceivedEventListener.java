package com.springgears.events.listener.messagereceived;

import com.springgears.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedEventListener
        implements ApplicationListener<MessageReceivedEvent> {

    @Override
    public void onApplicationEvent(MessageReceivedEvent event) {
        log.info("Simple listener received message with text: '" + event.getText() + "'");
    }
}
