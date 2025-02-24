package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class InvoiceService {

    private InvoiceService() {
        throw new IllegalStateException("Utility class");
    }

    public static AnsString getInvoiceByFacilitiesType(String serviceType) {
        if (serviceType.equals("water")) {
            return new AnsString("245444324");
        } else if (serviceType.equals("gaz")) {
            return new AnsString("234nll");
        } else {
            return new AnsString("not found");
        }
    }

    public static AnsString getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return new AnsString("123");
        } else if (facilitiesType.equals("gaz")) {
            return new AnsString("321");
        } else {
            return new AnsString("not found");
        }
    }
}