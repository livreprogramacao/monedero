package com.github.livreprogramacao.monedero.business;

public class ListUser {
    public void displayUsers(java.util.Collection<com.github.livreprogramacao.monedero.user.output.User> users) {
        users.stream().forEach(System.out::println);
    }
}
