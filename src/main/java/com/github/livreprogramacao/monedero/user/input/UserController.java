package com.github.livreprogramacao.monedero.user.input;

@lombok.extern.slf4j.Slf4j
@lombok.RequiredArgsConstructor
@RequestMapping
@RestController
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@javax.validation.Valid @RequestBody UserRequestDto dto) {
        log.info("starting the method.");

        return ResponseEntity.status(HttpStatus.CREATED).
                body(userService.createUser(dto));

        log.info("finishing the method.");
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        log.info("starting the method.");

        return ResponseEntity.ok(userService.getAllUsers());

        log.info("finishing the method.");
    }
}
