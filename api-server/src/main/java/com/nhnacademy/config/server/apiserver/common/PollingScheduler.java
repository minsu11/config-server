package com.nhnacademy.config.server.apiserver.common;

import com.nhnacademy.config.server.apiserver.config.UserConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.common
 * fileName       : PollingScheduler
 * author         : parkminsu
 * date           : 25. 4. 2.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 2.        parkminsu       최초 생성
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class PollingScheduler {

    private static String refreshUrl = "http://localhost:6060/actuator/refresh";

    @EventListener(ApplicationReadyEvent.class)
    public void startPolling() {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            try {
                log.info("Polling 시작");
                URL url = new URL(refreshUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);

                int responseCode = connection.getResponseCode();
                log.info("Polling Refresh Status: {}", responseCode);
            } catch (Exception e) {
                log.error("[Polling Refresh] 실패: {}", e.getMessage());
            }
        }, 0, 10, TimeUnit.SECONDS);
    }
}
