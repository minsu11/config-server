package com.nhnacademy.config.server.frontserver.service;

import com.nhnacademy.config.server.frontserver.adaptor.ApiAdaptor;
import com.nhnacademy.config.server.frontserver.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.nhnacademy.config.server.frontserver.service
 * fileName       : ApiService
 * author         : parkminsu
 * date           : 25. 4. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 7.        parkminsu       최초 생성
 */
@Service
@RequiredArgsConstructor
public class ApiService {
    private final ApiAdaptor apiAdaptor;

    public UserResponse getUserInfo() {
        return apiAdaptor.getUser();
    }
}
