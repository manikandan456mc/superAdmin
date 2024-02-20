package com.example.kgisl.microcollege.superAdmin.Services;

import java.text.SimpleDateFormat;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Date;

public class Common {

    public static String generateSequence(String shortCode) {
        String sequence = "";
        final SimpleDateFormat formatter = new SimpleDateFormat("YYYYMMDDHHmm");
        sequence = shortCode + formatter.format(new Date()) + RandomStringUtils.randomAlphanumeric(4);
        return sequence;
    }

}