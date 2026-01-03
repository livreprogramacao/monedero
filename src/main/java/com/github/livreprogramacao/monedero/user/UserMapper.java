package com.github.livreprogramacao.monedero.user;

@org.mapstruct.Mapper
public interface UserMapper {

    com.github.livreprogramacao.monedero.user.output.User toEntity(com.github.livreprogramacao.monedero.user.input.UserRequestDto dto);

    com.github.livreprogramacao.monedero.user.input.UserResponseDto toDto(com.github.livreprogramacao.monedero.user.output.User user);

}
