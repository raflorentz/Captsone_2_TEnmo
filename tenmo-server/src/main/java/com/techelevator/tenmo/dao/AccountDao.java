package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    boolean create(Account account);

    BigDecimal getBalance(long accountId);

    public List<Account> getAccountsByUsername(String username);

}
