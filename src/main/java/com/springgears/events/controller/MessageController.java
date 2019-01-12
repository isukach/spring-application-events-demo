package com.springgears.events.controller;

import com.springgears.events.event.MessageReceivedEvent;
import com.springgears.events.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/message")
public class MessageController {

    private final ApplicationEventPublisher eventPublisher;

    public MessageController(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @PostMapping
    public void sendMessage(@RequestBody Message message) {
        log.info("Controller received message.");
        eventPublisher.publishEvent(new MessageReceivedEvent(this, message.getText()));
    }

    @GetMapping("/sample")
    public Message getSampleMessage() {
        return new Message("Nothing of interest");
    }
}
