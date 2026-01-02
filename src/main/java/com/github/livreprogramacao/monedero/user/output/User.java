package com.github.livreprogramacao.monedero.user.output;

/**
 * User class representing a user in the system
 */

@lombok.ToString
@lombok.EqualsAndHashCode
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Getter
@lombok.Setter
@javax.persistence.Entity
@javax.persistence.Table(name = "users")
public class User {

    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private String id;

    private String name;
    private String email;

    @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

}
