package org.teckhooi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lim, Teck Hooi
 */

@Controller
@RequestMapping("/v1")
public class MembersController {
    @RequestMapping("/members/profile")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/members/new-profile")
    public String newProfile() {
        return "profile";
    }

    @RequestMapping("/members/notice")
    public String notice() {
        return "notice";
    }
}
