package com.github.livreprogramacao.monedero.business;

@lombok.extern.slf4j.Slf4j
public class RegisterUser {

    public static final String NEW = "NEW";
    private String name;
    private String email;
    private com.github.livreprogramacao.monedero.business.role.Status status;
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

    public RegisterUser(String name, String email, com.github.livreprogramacao.monedero.business.role.Status staus, com.github.livreprogramacao.monedero.business.role.CompanyRole role) {
        this.name = name;
        this.email = email;
        this.status = status;
        this.role = role;
        log.info("{}, {}, {}, {}", this.name, this.email, this.status, this.role);
    }

    public com.github.livreprogramacao.monedero.user.output.User register() {
        com.github.livreprogramacao.monedero.user.output.User user = new com.github.livreprogramacao.monedero.user.output.User(NEW, name, email, status, role);
        log.info("{}", user);
        return user;
    }

}