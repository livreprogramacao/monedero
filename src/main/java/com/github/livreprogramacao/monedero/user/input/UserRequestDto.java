package com.github.livreprogramacao.monedero.user.input;

@lombok.Data
@lombok.Builder
public class UserRequestDto {

    @lombok.NonNull
    private String username;

    @javax.validation.constraints.Email
    private String email;

}
