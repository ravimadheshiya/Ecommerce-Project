package com.FashNova.service;

import com.FashNova.model.Order;
import com.FashNova.model.Seller;
import com.FashNova.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
