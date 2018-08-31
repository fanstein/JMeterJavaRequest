package com.ctrip.jmeter.utils;

import com.csvreader.CsvReader;

import java.io.IOException;
import java.util.ArrayList;

public class CsvUtil {

    private static String[] readCsv(String filePath,String columnName) {
        ArrayList<String> List = new ArrayList<>();
        CsvReader csvReader;
        try {
            csvReader = new CsvReader(filePath);
            csvReader.readHeaders();
            int columnCount = csvReader.get("Latency").length();
            System.out.println("columnCount" + columnCount);
            while (csvReader.readRecord()){
                List.add(csvReader.get("Latency"));
//                List.add(csvReader.getValues());
//                System.out.println(List.get(0));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        String[] result = new String[List.size()];
        List.toArray(result);
        System.out.println(result.length);
        return result;
    }
}
