package com.chuno.member.controller;


import com.chuno.member.domain.MemberReqeustDto;
import com.chuno.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<Map> login(@RequestBody MemberReqeustDto dto){
        HttpStatus status = HttpStatus.OK;

        System.out.println("getUserPw : "+ dto.getUserPw());
        System.out.println("getUserId : "+ dto.getUserId());
        Map member = new HashMap();
        member.put("userId",dto.getUserId());
        member.put("userPw",dto.getUserPw());

        member.put("result",memberService.login(dto));

        return new ResponseEntity<Map>(member, status);

    }


}
