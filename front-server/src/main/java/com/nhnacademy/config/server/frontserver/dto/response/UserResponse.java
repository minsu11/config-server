package com.nhnacademy.config.server.frontserver.dto.response;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName    : com.nhnacademy.config.server.frontserver.dto.response
 * fileName       : UserResponse
 * author         : parkminsu
 * date           : 25. 4. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 7.        parkminsu       최초 생성
 */
@Getter
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String password;
}
