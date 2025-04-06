package com.nhnacademy.config.server.apiserver.controller;

import com.nhnacademy.config.server.apiserver.config.UserConfig;
import com.nhnacademy.config.server.apiserver.provider.UserConfigProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.controller
 * fileName       : Controller
 * author         : parkminsu
 * date           : 25. 4. 1.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 1.        parkminsu       최초 생성
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {
    private final UserConfigProvider userConfigProvider;
    @GetMapping("/test")
    public ResponseEntity<UserConfig> test(){
        return ResponseEntity.ok(userConfigProvider.getUserConfig());

    }
}
