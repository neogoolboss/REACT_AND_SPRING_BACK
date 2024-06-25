package com.ohgiraffers.springtest.mypage.model.dao;

import com.ohgiraffers.springtest.mypage.model.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyPageMapper {

    List<MemberDTO> findAllMembers();
}
