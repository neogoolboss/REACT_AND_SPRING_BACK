package com.ohgiraffers.springtest.mypage.model.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {

    private int memberId;
    private String email;
    private String nickname;
    private String gender;
    private String profile;
    private String introduce;
    private String memberRole;
    private Date signupAt;
    private String signupPlatform;

}
