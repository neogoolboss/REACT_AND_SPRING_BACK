package com.ohgiraffers.springtest.mypage.model.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FilesDTO {

    private int fileId;
    private String fileName;
    private int postId;

}
