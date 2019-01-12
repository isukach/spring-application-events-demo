package com.springgears.events.listener.messagereceived;

import com.springgears.events.event.MessageProcessedEvent;
import com.springgears.events.event.MessageReceivedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageReceivedAnnotationEventListener {

    @EventListener
    public MessageProcessedEvent receiveMessage(MessageReceivedEvent event) {
        log.info("Annotation listener received message with text: '" + event.getText() + "'");
        return new MessageProcessedEvent(this, event.getText());
    }
}
