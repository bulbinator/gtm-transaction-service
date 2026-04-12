package com.enbridge.gtm.service;

import com.enbridge.gtm.model.Transaction;
import com.enbridge.gtm.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void saveTransaction(Transaction transaction) {
        if (transaction.getGasVolume() > 0) {
            transactionRepository.save(transaction);
        }
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

}
