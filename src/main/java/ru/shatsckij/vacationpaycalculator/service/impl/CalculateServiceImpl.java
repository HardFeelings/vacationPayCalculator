package ru.shatsckij.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;
import ru.shatsckij.vacationpaycalculator.service.CalculateService;

@Service
public class CalculateServiceImpl implements CalculateService {

    private final Double AVG_DAYS = 29.3;
    @Override
    public Double calculate(Double avgSalary, Integer amountDays) {
        return (avgSalary / AVG_DAYS) * amountDays;
    }
}
