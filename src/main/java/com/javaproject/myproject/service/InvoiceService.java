package com.javaproject.myproject.service;

public class InvoiceService {

    public static String getInvoiceByFacilitiesType(String serviceType) {
        return serviceType + "=3n2n42j5n34njn";
    }

    public static double getDebtByFacilitiesType(String facilitiesType) {
        if (facilitiesType.equals("water")) {
            return 123;
        } else {
            return 321;
        }
    }
}