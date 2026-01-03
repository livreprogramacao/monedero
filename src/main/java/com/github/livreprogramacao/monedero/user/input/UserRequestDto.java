package com.github.livreprogramacao.monedero.user.input;

@lombok.extern.slf4j.Slf4j
public class UserRequestDto {

    @lombok.NonNull
    private String username;

    @javax.validation.constraints.Email
    private String email;

}
