package com.meradel.entity;

import com.meradel.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDatetime, Long insertUserID, LocalDate lastUpdateTime, Long lastUpdateUserId,
                String firstName, String lastName, String userName, String passWord, boolean enabled, String phone,
                Role role, Gender gender) {
        super(id, insertDatetime, insertUserID, lastUpdateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}
