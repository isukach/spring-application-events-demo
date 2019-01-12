package com.springgears.events.listener.messagereceived;

import com.springgears.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedAsyncEventListener {

    @Async
    @EventListener
    public void receiveMessageAsync(MessageReceivedEvent event) {
        log.info("Async listener received message with text: '" + event.getText() + "'");
    }
}
