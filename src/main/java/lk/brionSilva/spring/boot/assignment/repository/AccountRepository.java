package lk.brionSilva.spring.boot.assignment.repository;

import lk.brionSilva.spring.boot.assignment.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Copyright (c) 2019. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 20/06/2019
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
}
