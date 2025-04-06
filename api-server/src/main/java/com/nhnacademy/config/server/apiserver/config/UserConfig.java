package com.nhnacademy.config.server.apiserver.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.config
 * fileName       : UserConfig
 * author         : parkminsu
 * date           : 25. 4. 1.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 1.        parkminsu       최초 생성
 */
@RefreshScope
@ConfigurationProperties(value = "user")
@Getter
@Setter
public class UserConfig {
    private String id;
    private String password;
}
