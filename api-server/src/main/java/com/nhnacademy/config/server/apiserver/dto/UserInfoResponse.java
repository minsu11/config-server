package com.nhnacademy.config.server.apiserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.dto
 * fileName       : UserInfoResponse
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
public class UserInfoResponse {
    private String id;
    private String password;
}
