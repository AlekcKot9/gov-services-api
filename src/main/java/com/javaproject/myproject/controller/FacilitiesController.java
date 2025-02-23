package com.javaproject.myproject.controller;

import com.javaproject.myproject.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {

    @GetMapping("/invoicesByType/{facilitiesType}")
    public String getInvoiceByServiceType(@PathVariable String facilitiesType) {
        return InvoiceService.getInvoiceByFacilitiesType(facilitiesType);
    }

    @GetMapping("/invoicesDebt")
    public double getInvoicesDebt(@RequestParam String facilitiesType) {
        return InvoiceService.getDebtByFacilitiesType(facilitiesType);
    }
}
//для работы с счетами и поплнения счета