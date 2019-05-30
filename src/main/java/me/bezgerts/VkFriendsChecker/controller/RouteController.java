package me.bezgerts.VkFriendsChecker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

    @RequestMapping("/")
    public String getIndexPage() {
        return "index";
    }
}
