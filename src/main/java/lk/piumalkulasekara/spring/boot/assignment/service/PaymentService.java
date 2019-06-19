package lk.piumalkulasekara.spring.boot.assignment.service;

import lk.piumalkulasekara.spring.boot.assignment.model.Account;
import lk.piumalkulasekara.spring.boot.assignment.model.Payment;

public interface PaymentService {
    Iterable<Payment> getAllPayments();

    Payment getPayment(Integer id);

    Payment addPayment(Payment payment);

    Iterable<Payment> getPaymentsByAccountId(Integer accountId);
}