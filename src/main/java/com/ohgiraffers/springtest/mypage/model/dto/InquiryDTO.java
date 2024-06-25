package com.ohgiraffers.springtest.mypage.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InquiryDTO {

    private int inquiryId;
    private String inquiryTitle;
    private String inquiryContent;
    private Date inquiryAt;
    private String inquiryStatus; // DB에는 Char(1)임
    private int memberId;

}
