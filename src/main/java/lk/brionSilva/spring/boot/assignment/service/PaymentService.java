package lk.brionSilva.spring.boot.assignment.service;

import lk.brionSilva.spring.boot.assignment.model.Payment;

import java.util.Date;

public interface PaymentService {
    Iterable<Payment> getAllPayments();

    Iterable<Payment> filterPaymentsByAccountIdAndDate(Integer accountId, Date startDate, Date endDate);

    Payment getPayment(Integer id);

    Payment addPayment(Payment payment);
}