package com.github.livreprogramacao.monedero;

/**
 *
 * Hello world!
 *
 */
public class App {

    private final java.util.Collection<com.github.livreprogramacao.monedero.user.output.User> users = new java.util.ArrayList<>(100);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //log.info("Hello World!");

        new App().doSomething();
    }

    private void doSomething() {

        listCompanyRoles();
        registerUsers();

    }

    private void registerUsers() {
        // Registering users with various roles
        com.github.livreprogramacao.monedero.user.output.User userAlice = new com.github.livreprogramacao.monedero.business.RegisterUser("userAlice", "alice@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.CEO).register();
        com.github.livreprogramacao.monedero.user.output.User userBob = new com.github.livreprogramacao.monedero.business.RegisterUser("userBob", "bob@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.COO).register();
        com.github.livreprogramacao.monedero.user.output.User userCharlie = new com.github.livreprogramacao.monedero.business.RegisterUser("userCharlie", "charlie@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.CFO).register();
        com.github.livreprogramacao.monedero.user.output.User userDiana = new com.github.livreprogramacao.monedero.business.RegisterUser("userDiana", "diana@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.VICE_PRESIDENT).register();
        com.github.livreprogramacao.monedero.user.output.User userEthan = new com.github.livreprogramacao.monedero.business.RegisterUser("userEthan", "ethan@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.GENERAL_MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User userFiona = new com.github.livreprogramacao.monedero.business.RegisterUser("userFiona", "fiona@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User userGeorge = new com.github.livreprogramacao.monedero.business.RegisterUser("userGeorge", "george@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.ASSISTANT_MANAGER).register();
        com.github.livreprogramacao.monedero.user.output.User userHannah = new com.github.livreprogramacao.monedero.business.RegisterUser("userHannah", "hannah@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.TEAM_LEAD).register();
        com.github.livreprogramacao.monedero.user.output.User userIan = new com.github.livreprogramacao.monedero.business.RegisterUser("userIan", "ian@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.SUPERVISOR).register();
        com.github.livreprogramacao.monedero.user.output.User userJack = new com.github.livreprogramacao.monedero.business.RegisterUser("userJack", "jack@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.STAFF).register();
        com.github.livreprogramacao.monedero.user.output.User userKelly = new com.github.livreprogramacao.monedero.business.RegisterUser("userKelly", "kelly@example.github.com", com.github.livreprogramacao.monedero.business.role.CompanyRole.INTERN).register();

        users.add(userAlice);
        users.add(userBob);
        users.add(userCharlie);
        users.add(userDiana);
        users.add(userEthan);
        users.add(userFiona);
        users.add(userGeorge);
        users.add(userHannah);
        users.add(userIan);
        users.add(userJack);
        users.add(userKelly);

        // Displaying all registered users
        new com.github.livreprogramacao.monedero.business.ListUser().displayUsers(users);
    }

    private static void listCompanyRoles() {
        for (com.github.livreprogramacao.monedero.business.role.CompanyRole role : com.github.livreprogramacao.monedero.business.role.CompanyRole.values()) {
            System.out.println("Role name:\t\t\t" + role.name() + "\nDescription:\t\t" + role.getDescription() + "\n");
        }
    }
}
