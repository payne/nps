package org.mattpayne.spring.nps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/newTopic")
    public String newTopic() {
        return "thanks";
    }
}
