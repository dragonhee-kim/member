package com.chuno.member.mapper;

import com.chuno.member.domain.MemberReqeustDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface MemberMapper {
    MemberReqeustDto findAll();
}
