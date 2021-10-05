package com.crio.debugging.csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.opencsv.CSVReader;

public class CitizenParser {
    public List<Person> getAllCitizenSortedByEmail(String filename) throws IOException {
        URL resource = Thread.currentThread().getContextClassLoader().getResource(filename);
        CSVReader reader = new CSVReader(new FileReader(resource.getFile()));
        List<Person> result = new ArrayList<>();
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            Person person = new Person(nextLine);
            result.add(person);
        }
        result.sort(Comparator.comparing(Person::getEmail));
        return result;
    }
}
