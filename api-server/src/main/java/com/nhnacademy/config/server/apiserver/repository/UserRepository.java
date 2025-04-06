package com.nhnacademy.config.server.apiserver.repository;

import com.nhnacademy.config.server.apiserver.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.repository
 * fileName       : UserRepository
 * author         : parkminsu
 * date           : 25. 4. 1.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 1.        parkminsu       최초 생성
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
