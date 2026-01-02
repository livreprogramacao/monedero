package com.github.livreprogramacao.monedero.business;

@lombok.extern.slf4j.Slf4j
public class RegisterUser {

    public static final String NEW = "NEW";
    private String name;
    private String email;
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

    public RegisterUser(String name, String email, com.github.livreprogramacao.monedero.business.role.CompanyRole role) {
        this.name = name;
        this.email = email;
        this.role = role;
        log.info("{}, {}, {}",this.name, this.email, this.role);
    }

    public com.github.livreprogramacao.monedero.user.output.User register() {
        com.github.livreprogramacao.monedero.user.output.User user = new com.github.livreprogramacao.monedero.user.output.User(NEW, name, email, role);
        log.info("{}", user);
        return user;
    }

}