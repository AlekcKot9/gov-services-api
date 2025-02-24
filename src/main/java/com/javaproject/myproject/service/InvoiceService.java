package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class InvoiceService {

    private InvoiceService() {
        throw new IllegalStateException("Utility class");
    }

    public static AnsString getInvoiceById(String serviceType) {
        if (serviceType.equals("123456")) {
            return new AnsString("245444324");
        } else if (serviceType.equals("654321")) {
            return new AnsString("734654322");
        } else {
            return null;
        }
    }

    public static AnsString getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return new AnsString("12345678");
        } else if (facilitiesType.equals("gaz")) {
            return new AnsString("87654321");
        } else {
            return null;
        }
    }
}