package com.github.livreprogramacao.monedero.user.input;

@lombok.Value
@lombok.Builder
public class UserResponseDto {

    @lombok.NonNull
    private Long Id;

    @lombok.NonNull
    private String username;

    @lombok.NonNull
    private String email;

    @lombok.NonNull
    private String status;

    @lombok.NonNull
    private String role;

}
