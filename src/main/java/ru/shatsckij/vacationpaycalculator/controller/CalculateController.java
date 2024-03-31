package ru.shatsckij.vacationpaycalculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shatsckij.vacationpaycalculator.service.CalculateService;

@RestController
@RequiredArgsConstructor
public class CalculateController {

    private final CalculateService calculateService;
    @GetMapping("/calculate")
    public Double calculate(@RequestParam("avgSalary") Double avgSalary,
                            @RequestParam("amountDays") Integer amountDays){

        return calculateService.calculate(avgSalary, amountDays);
    }
}
