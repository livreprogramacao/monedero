package com.github.livreprogramacao.monedero.business;

@lombok.extern.slf4j.Slf4j
public class ListUser {
    public void displayUsers(java.util.Collection<com.github.livreprogramacao.monedero.user.output.User> users) {
        users.stream().forEach(u -> log.info("{}", u));
    }
}
