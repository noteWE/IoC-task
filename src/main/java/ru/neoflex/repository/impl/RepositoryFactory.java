package ru.neoflex.repository.impl;


import java.util.Objects;

public class RepositoryFactory {

    private OrderRepositoryImpl repoInstance;

    public OrderRepositoryImpl createInstance() {
        return Objects.requireNonNullElseGet(repoInstance, () -> repoInstance = new OrderRepositoryImpl());
    }
}
