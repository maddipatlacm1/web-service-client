package com.controller;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) throws Exception {
        String name = "Pieline FileStatusService";
        System.out.println(name.split("\\s+")[0]);


        String startDate = "2024-01-05";
        String endDate = "2024-01-11";
        String[] strings = new String[]{"2024-01-01 13:24:33.711",
                "2024-01-02 13:24:33.711",
                "2024-01-03 13:24:33.711",
                "2024-01-04 13:24:33.711",
                "2024-01-05 13:24:33.711",
                "2024-01-06 13:24:33.711",
                "2024-01-07 13:24:33.711",
                "2024-01-08 13:24:33.711",
                "2024-01-09 13:24:33.711",
                "2024-01-10 13:24:33.711",
                "2024-01-11 13:24:33.711",
                "2024-01-12 13:24:33.711"};
        for (int i = 0; i < 12; i++) {
            if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
                String dateString = strings[i];
                Date txDate = new SimpleDateFormat(DATE_FORMAT).parse(dateString);
                Date startingDate = new SimpleDateFormat(DATE_FORMAT).parse(startDate);
                Date endingDate = new SimpleDateFormat(DATE_FORMAT).parse(endDate);

                if (txDate.before(startingDate) || txDate.after(endingDate)) {
                    continue;
                }
                System.out.println(dateString);
            }
        }
    }
}
