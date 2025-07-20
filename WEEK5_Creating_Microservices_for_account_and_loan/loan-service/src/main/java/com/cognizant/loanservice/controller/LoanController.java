package com.cognizant.loanservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping("/{id}")
    public Loan getLoan(@PathVariable String id) {
        return new Loan(id, "Home Loan", 500000, "15 years");
    }

    static class Loan {
        public String loanId;
        public String type;
        public double amount;
        public String tenure;

        public Loan(String loanId, String type, double amount, String tenure) {
            this.loanId = loanId;
            this.type = type;
            this.amount = amount;
            this.tenure = tenure;
        }
    }
}
