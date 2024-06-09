package com.gideonalves.demonstracao_crud.controller;

public record CreateUserDto(
    String name,
    String email,
    String username,
    String password) {}