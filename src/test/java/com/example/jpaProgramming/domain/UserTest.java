package com.example.jpaProgramming.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setName("ming");
        user.setEmail("ming@naver.com");

        System.out.println(user);
    }
}