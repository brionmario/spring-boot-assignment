package lk.piumalkulasekara.spring.boot.assignment.service;

import lk.piumalkulasekara.spring.boot.assignment.model.Account;

public interface AccountService {
    Iterable<Account> getAllAccounts();

    Account getAccount(Integer id);

    Account addAccount(Account account);
}