package com.nhnacademy.config.server.frontserver.adaptor;

import com.nhnacademy.config.server.frontserver.dto.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * packageName    : com.nhnacademy.config.server.frontserver.adaptor
 * fileName       : ApiAdaptor
 * author         : parkminsu
 * date           : 25. 4. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 7.        parkminsu       최초 생성
 */
@FeignClient(name = "api-adaptor", url = "${api.server.url}")
public interface ApiAdaptor {
    @GetMapping("/test")
    public UserResponse getUser();

    @PostMapping("/actuator/refresh")
    public String refresh();
}
