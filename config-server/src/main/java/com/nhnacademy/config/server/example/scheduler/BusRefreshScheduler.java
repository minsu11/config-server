//package com.nhnacademy.config.server.example.scheduler;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
///**
// * packageName    : com.nhnacademy.config.server.example.scheduler
// * fileName       : BusScheduler
// * author         : parkminsu
// * date           : 25. 4. 2.
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 25. 4. 2.        parkminsu       최초 생성
// */
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class BusRefreshScheduler {
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    @Scheduled(fixedRate = 20000) // 1분마다
//    public void triggerBusRefresh() {
//        String url = "http://localhost:8888/actuator/bus-refresh";
//        try {
//            restTemplate.postForEntity(url, null, String.class);
//            log.info("Bus Refresh Triggered");
//        } catch (Exception e) {
//            log.error("Bus Refresh Failed: {}", e.getMessage());
//        }
//    }
//}
//
