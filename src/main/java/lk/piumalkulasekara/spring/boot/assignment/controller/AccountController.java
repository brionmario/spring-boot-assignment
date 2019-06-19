package lk.piumalkulasekara.spring.boot.assignment.controller;

import lk.piumalkulasekara.spring.boot.assignment.exception.AccountNotFoundException;
import lk.piumalkulasekara.spring.boot.assignment.model.Account;
import lk.piumalkulasekara.spring.boot.assignment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping(path="/")
    Account addAccount (@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/{id}")
    Account getAccount(@PathVariable Integer id) {
        return accountService.getAccount(id);
    }

    @GetMapping(path="/")
    Iterable<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
