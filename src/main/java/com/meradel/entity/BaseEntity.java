package com.meradel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity {

    private Long id ;
    private LocalDateTime insertDatetime;
    private Long insertUserID;
    private LocalDate lastUpdateTime;
    private Long lastUpdateUserId;

}
