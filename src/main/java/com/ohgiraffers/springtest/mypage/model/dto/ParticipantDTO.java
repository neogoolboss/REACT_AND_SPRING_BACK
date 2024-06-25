package com.ohgiraffers.springtest.mypage.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ParticipantDTO {

    private int participantId;
    private Date participantAt;
    private String honeyRole;
    private int honeyId;
    private int memberId;

}
