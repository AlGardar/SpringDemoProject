package org.gardar.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home.html";
    }
    @RequestMapping(value = "/my-home", method = RequestMethod.GET)
    public String myHome(Model page) {
        page.addAttribute("userName", "Katy");
        page.addAttribute("color", "red");
        return "my-home.html";
    }
}
