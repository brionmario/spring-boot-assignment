package lk.brionSilva.spring.boot.assignment.controller;

import lk.brionSilva.spring.boot.assignment.model.Account;
import lk.brionSilva.spring.boot.assignment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping(path="/account")
    Account addAccount (@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/account/{id}")
    Account getAccount(@PathVariable Integer id) {
        return accountService.getAccount(id);
    }

    @GetMapping(path="/account")
    Iterable<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
