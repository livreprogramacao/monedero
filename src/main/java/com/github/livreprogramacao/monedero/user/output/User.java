package com.github.livreprogramacao.monedero.user.output;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * User class representing a user in the system
 */
public class User {

    private String id;
    private String name;
    private String email;
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

    public User(String name, String email, com.github.livreprogramacao.monedero.business.role.CompanyRole role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }


}
