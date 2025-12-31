package com.github.livreprogramacao.monedero;

import com.github.livreprogramacao.monedero.business.RegisterUser;

/**
 *
 * Hello world!
 *
 */
public class App {

    private RegisterUser registerUser;
    private java.util.Collection<com.github.livreprogramacao.monedero.user.output.User> users = new java.util.ArrayList<>(100);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        new App().doSomething();
    }

    private void doSomething() {

        listCompanyRoles();
        registerUsers();

    }

    private void registerUsers() {
        // Registering users with various roles
        com.github.livreprogramacao.monedero.user.output.User Alice = new com.github.livreprogramacao.monedero.business.RegisterUser("Alice", "alice@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.CEO).register();
        com.github.livreprogramacao.monedero.user.output.User Bob = new com.github.livreprogramacao.monedero.business.RegisterUser("Bob", "bob@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.COO).register();
        com.github.livreprogramacao.monedero.user.output.User Charlie = new com.github.livreprogramacao.monedero.business.RegisterUser("Charlie", "charlie@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.CFO).register();
        com.github.livreprogramacao.monedero.user.output.User Diana = new com.github.livreprogramacao.monedero.business.RegisterUser("Diana", "diana@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.VICE_PRESIDENT).register();
        com.github.livreprogramacao.monedero.user.output.User Ethan = new com.github.livreprogramacao.monedero.business.RegisterUser("Ethan", "ethan@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.GENERAL_MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User Fiona = new com.github.livreprogramacao.monedero.business.RegisterUser("Fiona", "fiona@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User George = new com.github.livreprogramacao.monedero.business.RegisterUser("George", "george@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.ASSISTANT_MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User Hannah = new com.github.livreprogramacao.monedero.business.RegisterUser("Hannah", "hannah@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.TEAM_LEAD).register();
        com.github.livreprogramacao.monedero.user.output.User Ian = new com.github.livreprogramacao.monedero.business.RegisterUser("Ian", "ian@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.SUPERVISOR).register();
        com.github.livreprogramacao.monedero.user.output.User Jack = new com.github.livreprogramacao.monedero.business.RegisterUser("Jack", "jack@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.STAFF).register();
        com.github.livreprogramacao.monedero.user.output.User Kelly = new com.github.livreprogramacao.monedero.business.RegisterUser("Kelly", "kelly@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.INTERN).register();

        users.add(Alice);
        users.add(Bob);
        users.add(Charlie);
        users.add(Diana);
        users.add(Fiona);
        users.add(George);
        users.add(Hannah);
        users.add(Ian);
        users.add(Jack);
        users.add(Kelly);

        // Displaying all registered users
        new com.github.livreprogramacao.monedero.business.ListUser().displayUsers(users);
    }

    private static void listCompanyRoles() {
        for (com.github.livreprogramacao.monedero.business.role.CompanyRole role : com.github.livreprogramacao.monedero.business.role.CompanyRole.values()) {
            System.out.println("Role name:\t\t\t" + role.name() + "\nDescription:\t\t" + role.getDescription() + "\n");
        }
    }
}
