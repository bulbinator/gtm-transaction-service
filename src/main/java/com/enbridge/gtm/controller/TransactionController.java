package com.enbridge.gtm.controller;

import com.enbridge.gtm.model.Transaction;
import com.enbridge.gtm.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public void create(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
    }
}
