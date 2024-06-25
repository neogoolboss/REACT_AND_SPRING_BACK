package com.ohgiraffers.springtest.mypage.model.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NoticeDTO {

    private int noticeId;
    private int memberId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeAt;
    private String noticeExposureStatus; // DB에선 Char(1)

}
