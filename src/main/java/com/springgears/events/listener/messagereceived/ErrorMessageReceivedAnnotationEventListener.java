package com.springgears.events.listener.messagereceived;

import com.springgears.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorMessageReceivedAnnotationEventListener {

    @EventListener(condition = "#event.text.toLowerCase().contains('error')")
    public void receiveMessage(MessageReceivedEvent event) {
        log.info("Error message listener received message with text: '" + event.getText() + "'");
    }
}
