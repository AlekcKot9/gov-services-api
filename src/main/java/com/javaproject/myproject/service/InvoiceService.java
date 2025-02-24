package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class InvoiceService {

    private InvoiceService() {
        throw new IllegalStateException("Utility class");
    }

    public static AnsString getInvoiceByFacilitiesType(String serviceType) {
        if (serviceType.equals("water")) {
            return new AnsString("245444324");
        } else {
            return new AnsString("234nll");
        }
    }

    public static AnsString getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return new AnsString("123");
        } else {
            return new AnsString("321");
        }
    }
}