package com.ohgiraffers.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "컨트롤러 테스트";
    }

    @GetMapping("/mypage")
    public List<String> hello() {

        return Arrays.asList("테스트", "테스트2", "세번째");
    }
}
