package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.lang.annotation.ElementType;
import java.math.BigDecimal;
import java.util.List;

public interface SalaryProcessor {
    BigDecimal calculateSalaries(List<Employee> employees);
}
