package lk.brionSilva.spring.boot.assignment.service;

import lk.brionSilva.spring.boot.assignment.model.Account;
import lk.brionSilva.spring.boot.assignment.model.Payment;

public interface AccountService {
    Iterable<Account> getAllAccounts();

    Account getAccount(Integer id);

    Account addAccount(Account account);

    Iterable<Payment> getPayments(Integer id);
}