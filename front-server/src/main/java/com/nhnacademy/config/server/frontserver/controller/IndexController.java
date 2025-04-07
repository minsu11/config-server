package com.nhnacademy.config.server.frontserver.controller;

import com.nhnacademy.config.server.frontserver.dto.response.UserResponse;
import com.nhnacademy.config.server.frontserver.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 * packageName    : com.nhnacademy.config.server.frontserver.controller
 * fileName       : IndexController
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
public class IndexController {
    private final ApiService apiService;

    @GetMapping("/")
    public String index(Model model) {
        UserResponse response = apiService.getUserInfo();
        model.addAttribute("user", response);
        return "index";
    }
}
