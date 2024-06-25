package com.ohgiraffers.springtest.mypage.model.service;

import com.ohgiraffers.springtest.mypage.model.dao.MyPageMapper;
import com.ohgiraffers.springtest.mypage.model.dto.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyPageService {

    private final MyPageMapper myPageMapper;

    public MyPageService(MyPageMapper myPageMapper) {
        this.myPageMapper = myPageMapper;
    }

    public List<MemberDTO> findAllMembers() {
        return myPageMapper.findAllMembers();
    }
}
