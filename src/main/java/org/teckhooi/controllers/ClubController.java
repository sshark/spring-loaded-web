package org.teckhooi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lim, Teck Hooi
 */

@Controller
@RequestMapping("/v1")
public class ClubController {
    @RequestMapping("/club/notice")
    public String notice() {
        return "notice";
    }
}
