package com.enbridge.gtm.service;

import com.enbridge.gtm.model.Transaction;
import com.enbridge.gtm.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {
    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private TransactionService transactionService;

    @Test
    public void saveTransaction_WhenVolumePositive() {
        Transaction transaction = new Transaction("Test", 10, "Test");
        transactionService.saveTransaction(transaction);
        verify(transactionRepository).save(transaction);
    }

    @Test
    public void saveTransaction_WhenVolumeNegative() {
        Transaction transaction = new Transaction("Test", -10, "Test");
        assertThrows(InvalidTransactionException.class, () -> {
            transactionService.saveTransaction(transaction);
        });
    }
}
