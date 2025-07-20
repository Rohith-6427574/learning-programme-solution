package com.cognizant.accountservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable String id) {
        return new Account(id, "John Doe", "Savings", 10000);
    }

    static class Account {
        public String id;
        public String name;
        public String type;
        public double balance;

        public Account(String id, String name, String type, double balance) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.balance = balance;
        }
    }
}
