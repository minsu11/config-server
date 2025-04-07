package com.nhnacademy.config.server.frontserver.controller;

import com.nhnacademy.config.server.frontserver.service.ActuatorService;
import com.nhnacademy.config.server.frontserver.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * packageName    : com.nhnacademy.config.server.frontserver.controller
 * fileName       : RefreshController
 * author         : parkminsu
 * date           : 25. 4. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 7.        parkminsu       최초 생성
 */
@Controller
@RequiredArgsConstructor
public class RefreshController {
    private final ActuatorService actuatorService;

    @PostMapping("/refresh")
    public String refresh() {
        actuatorService.refresh();
        return "redirect:/";
    }
}
