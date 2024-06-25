package com.ohgiraffers.springtest.mypage.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommentsDTO {

    private int commentId;
    private String commentContent;
    private Date commentAt;
    private int honeyId;
    private int memberId;

}
