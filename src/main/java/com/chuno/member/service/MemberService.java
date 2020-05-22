package com.chuno.member.service;

import com.chuno.member.domain.Member;
import com.chuno.member.domain.MemberRepository;
import com.chuno.member.domain.MemberReqeustDto;
import com.chuno.member.mapper.MemberMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemberService.class);

    @Autowired
    MemberRepository memberRepository;


    @Autowired
    MemberMapper memberMapper;

    public String login(MemberReqeustDto dto){
        LOGGER.debug(dto.getUserId() + "/" + dto.getUserPw());
        System.out.println("tset : "+ dto.getUserPw());
        String result = "1";
        MemberReqeustDto m = memberMapper.findAll();

        LOGGER.info("m is  {}",m);


        return result;
    }

}
