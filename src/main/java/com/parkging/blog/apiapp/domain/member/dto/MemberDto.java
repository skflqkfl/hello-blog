package com.parkging.blog.apiapp.domain.member.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDto {
    @NotEmpty
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty @Email
    private String email;

    @Builder
    public MemberDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
