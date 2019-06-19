package lk.piumalkulasekara.spring.boot.assignment.repository;

import lk.piumalkulasekara.spring.boot.assignment.model.Account;
import lk.piumalkulasekara.spring.boot.assignment.model.Payment;
import org.springframework.data.repository.CrudRepository;

/**
 * Copyright (c) 2019. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 20/06/2019
 */
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
