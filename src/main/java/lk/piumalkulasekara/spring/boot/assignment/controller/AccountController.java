package lk.piumalkulasekara.spring.boot.assignment.controller;

import lk.piumalkulasekara.spring.boot.assignment.exception.AccountNotFoundException;
import lk.piumalkulasekara.spring.boot.assignment.model.Account;
import lk.piumalkulasekara.spring.boot.assignment.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping(path="/")
    Account addAccount (@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping("/{id}")
    Account getAccount(@PathVariable Integer id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }

    @GetMapping(path="/")
    Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
