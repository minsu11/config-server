package com.nhnacademy.config.server.apiserver.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.nhnacademy.config.server.apiserver.user.entity
 * fileName       : User
 * author         : parkminsu
 * date           : 25. 4. 1.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 1.        parkminsu       최초 생성
 */
@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_input_id")
    private String userInputId;

    @Column(name = "user_input_password")
    private String userInputPassword;
}
