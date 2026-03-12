package com.github.livreprogramacao.monedero.user.output;

/**
 * User class representing a user in the system
 */

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
    private com.github.livreprogramacao.monedero.business.role.Status status;

    @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
    private com.github.livreprogramacao.monedero.business.role.CompanyRole role;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", status=").append(status);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        com.github.livreprogramacao.monedero.user.output.User user = (com.github.livreprogramacao.monedero.user.output.User) o;
        return java.util.Objects.equals(getId(), user.getId()) && java.util.Objects.equals(getName(), user.getName()) && java.util.Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getId(), getName(), getEmail());
    }

}
