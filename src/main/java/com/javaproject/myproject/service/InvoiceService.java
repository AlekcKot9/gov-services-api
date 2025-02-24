package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class InvoiceService {

    private InvoiceService() {
        throw new IllegalStateException("Utility class");
    }

    public static AnsString getInvoiceById(String serviceType) {
        if (serviceType.equals("1234")) {
            return new AnsString("245444324");
        } else if (serviceType.equals("4321")) {
            return new AnsString("234654322");
        } else {
            return null;
        }
    }

    public static AnsString getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return new AnsString("123");
        } else if (facilitiesType.equals("gaz")) {
            return new AnsString("321");
        } else {
            return null;
        }
    }
}