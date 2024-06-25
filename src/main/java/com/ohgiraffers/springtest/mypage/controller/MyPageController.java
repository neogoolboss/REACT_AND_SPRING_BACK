package com.ohgiraffers.springtest.mypage.controller;

import com.ohgiraffers.springtest.mypage.model.dto.MemberDTO;
import com.ohgiraffers.springtest.mypage.model.service.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mypage")
public class MyPageController {

    @Autowired
    private MyPageService myPageService;

    @GetMapping("/memberlist")
    public ResponseEntity<Map<String, Object>> findAllMembers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        List<MemberDTO> members = myPageService.findAllMembers();
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("members", members);

        return new ResponseEntity<>(responseMap, headers, HttpStatus.OK);
    }
}
