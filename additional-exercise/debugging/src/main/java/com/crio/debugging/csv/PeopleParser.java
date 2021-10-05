package com.crio.debugging.csv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.opencsv.CSVReader;

public class PeopleParser {
    public void printAllPeopleNameAndProfession(String filename) throws IOException {
        InputStream resource = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
        CSVReader reader = new CSVReader(new InputStreamReader(resource));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            System.out.println(("Name: " + nextLine[1] + " " + nextLine[2]
                    + ", Phone Number: " + nextLine[5]));
        }
    }
}  