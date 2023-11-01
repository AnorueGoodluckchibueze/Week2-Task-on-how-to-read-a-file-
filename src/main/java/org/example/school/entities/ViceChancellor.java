package org.example.school.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ViceChancellor extends Staff {
    private LocalDate tenureStartDate;

    public LocalDate getTenureStartDate() {
        return tenureStartDate;
    }

    public void setTenureStartDate(LocalDate tenureStartDate) {
        this.tenureStartDate = tenureStartDate;
    }
}
