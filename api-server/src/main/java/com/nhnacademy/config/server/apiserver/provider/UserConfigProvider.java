package com.nhnacademy.config.server.apiserver.provider;

import com.nhnacademy.config.server.apiserver.config.UserConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.provider
 * fileName       : UserConfigProvider
 * author         : parkminsu
 * date           : 25. 4. 4.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 4.        parkminsu       최초 생성
 */
@Component
@RequiredArgsConstructor
public class UserConfigProvider {
    private final ObjectProvider<UserConfig> userConfigProvider;

    public UserConfig getUserConfig() {
        // 조건부일 때 사용, bean이 무조건 주입이 아닌 조건부에 주입했을 경우
        // 없으면 null을 반환
//        userConfigProvider.getIfAvailable();
        return userConfigProvider.getObject();
    }

    public String getUserId(){
        return getUserConfig().getId();
    }

    public String getPassword(){
        return getUserConfig().getPassword();
    }



}
