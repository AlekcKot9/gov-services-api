package com.javaproject.myproject.controller;

import com.javaproject.myproject.model.*;
import com.javaproject.myproject.service.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {
/*
    @GetMapping("/{id}")
    public AnsString getInvoiceByServiceType(@PathVariable String id) {
        return InvoiceService.getInvoiceByFacilitiesType(id);
    }
 */

    @GetMapping("/{id}")
    public ResponseEntity<AnsString> getInvoiceById(@PathVariable String id) {
        if (id == null || id.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        AnsString ans = InvoiceService.getInvoiceById(id);
        if (ans == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(ans);
    }

    @GetMapping("/debt")
    public ResponseEntity<AnsString> getInvoicesDebt(@RequestParam String invoiceType) {
        if (invoiceType == null || invoiceType.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        AnsString ans = InvoiceService.getDebtByFacilitiesType(invoiceType);
        if (ans == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(ans);
    }
}
//для работы с счетами и поплнения счета