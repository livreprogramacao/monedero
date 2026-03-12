package com.github.livreprogramacao.monedero.user.input;

@lombok.RequiredArgsConstructor
@lombok.extern.slf4j.Slf4j
@Service
public class UserService {

    private final com.github.livreprogramacao.monedero.user.repository.UserRepository userRepository;
    private final com.github.livreprogramacao.monedero.user.UserMapper userMapper;


    public UserResponseDto createUser(UserRequestDto dto) {
        log.info("start");
        com.github.livreprogramacao.monedero.user.output.User user = userMapper.toEntity(dto);
        user.setStatus(com.github.livreprogramacao.monedero.business.role.Status.ACTIVE);
        user = userRepository.save(user);
        log.info("finish");
        return userMapper.toDto(user);
    }

    public java.util.List<UserResponseDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(java.util.stream.Collectors.toUnmodifiableList());
    }
}


