package com.ohgiraffers.springtest.mypage.model.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PostHoneyDTO {

    private int honeyId;
    private int honeyGenre;
    private String honeyTitle;
    private String honeyContent;
    private int totalPeople;
    private String honeyCity;
    private String honeyRegion;
    private Date honeyAt;
    private Date honeyUntil;
    private String honeyFullStatus; // DB에서는 Char(1)
    private String honeyExposureStatus; // DB에서는 Char(1)
    private int honeyReportCount;
    private int memberId;
    private int ticketId;

}
