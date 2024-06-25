package com.ohgiraffers.springtest.mypage.model.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketDTO {

    private int ticketId;
    private String ticketTitle;
    private int price;
    private int discount;
    private Date salesAt;
    private Date salesUntil;
    private String salesWhere;
    private String ticketPoster;
    private int ticketGenre;

}
