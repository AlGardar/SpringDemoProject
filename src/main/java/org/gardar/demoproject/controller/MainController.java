package org.gardar.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home.html";
    }
    @RequestMapping(value = "/my-home/{color}", method = RequestMethod.GET)
    public String myHome(@PathVariable String color, @RequestParam(required = false) String get, Model page) {
        page.addAttribute("userName", "Katy");
        page.addAttribute("color", color);
        return "my-home.html";
    }
}
