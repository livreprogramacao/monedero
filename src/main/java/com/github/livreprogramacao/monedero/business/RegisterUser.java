package com.github.livreprogramacao.monedero.business;

public class RegisterUser {

    public static final String NEW = "NEW";
    private String name;
    private String email;
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

    public RegisterUser(String name, String email, com.github.livreprogramacao.monedero.business.role.CompanyRole role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public com.github.livreprogramacao.monedero.user.output.User register() {
        return new com.github.livreprogramacao.monedero.user.output.User(NEW, name, email, role);
    }

}
