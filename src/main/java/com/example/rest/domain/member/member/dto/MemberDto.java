package com.example.rest.domain.member.member.dto;

import com.example.rest.domain.member.member.entity.Member;
import com.example.rest.domain.post.post.entity.Post;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberDto {

    private long id;
    @JsonProperty("createdDateTime")
    private LocalDateTime createdDate;
    @JsonProperty("modifiedDateTime")
    private LocalDateTime modifiedDate;
    private String username;
    private String password;
    private String nickname;

    public MemberDto(Member member) {

        this.id = member.getId();
        this.createdDate = member.getCreatedDate();
        this.modifiedDate = member.getModifiedDate();
        this.username = member.getUsername();
        this.password = member.getPassword();
        this.nickname = member.getNickName();
    }
}
