package com.chuno.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MemberReqeustDto {

    private String userId;
    private String userPw;

    public Member toEntity(){
        return Member.builder()
                .userId(userId)
                .userPw(userPw)
                .build();

    }

}
