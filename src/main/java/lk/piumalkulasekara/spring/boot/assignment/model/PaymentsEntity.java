package lk.piumalkulasekara.spring.boot.assignment.model;

import javax.persistence.Entity;

/**
 * Copyright (c) 2019. Aparecium Labs.  http://www.apareciumlabs.com
 *
 * @author brionsilva
 * @version 1.0
 * @since 20/06/2019
 */
@Entity
public class PaymentsEntity {

    private Double amount;
    private String type;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
