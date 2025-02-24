package com.javaproject.myproject.controller;

import com.javaproject.myproject.model.*;
import com.javaproject.myproject.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {

    @GetMapping("/{id}")
    public AnsString getInvoiceByServiceType(@PathVariable String id) {
        return InvoiceService.getInvoiceByFacilitiesType(id);
    }

    @GetMapping("/debt")
    public AnsString getInvoicesDebt(@RequestParam String invoiceType) {
        return InvoiceService.getDebtByFacilitiesType(invoiceType);
    }
}
//для работы с счетами и поплнения счета