package lk.brionSilva.spring.boot.assignment.controller;

import lk.brionSilva.spring.boot.assignment.model.Account;
import lk.brionSilva.spring.boot.assignment.model.Payment;
import lk.brionSilva.spring.boot.assignment.service.AccountService;
import lk.brionSilva.spring.boot.assignment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private AccountService accountService;

    @PostMapping("/account/{accountId}/payments")
    public Payment addPayment(@PathVariable (value = "accountId") Integer accountId,
                                 @Valid @RequestBody Payment payment) {
        Account account = accountService.getAccount(accountId);
        payment.setAccount(account);
        return paymentService.addPayment(payment);
    }

    @GetMapping(path="/payments")
    Iterable<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }
}
