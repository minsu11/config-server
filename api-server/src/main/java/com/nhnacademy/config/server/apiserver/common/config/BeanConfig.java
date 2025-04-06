package com.nhnacademy.config.server.apiserver.common.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.common.config
 * fileName       : BeanConfig
 * author         : parkminsu
 * date           : 25. 4. 2.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 2.        parkminsu       최초 생성
 */
@Configuration
public class BeanConfig {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();

    }
}
