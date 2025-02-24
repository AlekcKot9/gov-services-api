package com.javaproject.myproject.service;

public class InvoiceService {

    private InvoiceService() {
        throw new IllegalStateException("Utility class");
    }

    public static String getInvoiceByFacilitiesType(String serviceType) {
        if (serviceType.equals("water")) {
            return "245444324";
        } else {
            return "234nll";
        }
    }

    public static double getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return 123;
        } else {
            return 321;
        }
    }
}