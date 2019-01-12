package com.springgears.events.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class MessageReceivedEvent extends ApplicationEvent {

    private String text;

    public MessageReceivedEvent(Object source, String text) {
        super(source);
        this.text = text;
    }
}
