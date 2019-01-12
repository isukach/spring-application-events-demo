package com.springgears.events.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class MessageProcessedEvent extends ApplicationEvent {
    private String text;

    public MessageProcessedEvent(Object source, String text) {
        super(source);
        this.text = text;
    }
}
