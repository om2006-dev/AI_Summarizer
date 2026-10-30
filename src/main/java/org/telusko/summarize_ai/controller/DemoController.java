package org.telusko.summarize_ai.controller;

import org.springframework.web.bind.annotation.*;
import org.telusko.summarize_ai.service.Summarise_Service;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final Summarise_Service service;
    public DemoController(Summarise_Service service)
    {
        this.service = service;
    }

    @PostMapping("/summarize")
    public String answer(@RequestBody String ticket)
    {
        return service.summarize(ticket);
    }

    @GetMapping("/new_chat")
    public String clear_chat()
    {
        return service.clear_history();
    }
}
