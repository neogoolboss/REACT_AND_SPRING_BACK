package com.ohgiraffers.springtest.mypage.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewDTO {

    private int reviewId;
    private double reviewScore;
    private String reviewContent;
    private int participantId;
    private int evaluatorMemberId;
    private int evaluatedMemberId;

}


