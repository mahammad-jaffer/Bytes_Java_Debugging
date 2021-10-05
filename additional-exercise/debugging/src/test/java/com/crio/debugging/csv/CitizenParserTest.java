package com.crio.debugging.csv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class CitizenParserTest {

    @Test
    void printAllEmployeeNameAndPhoneNumbers() throws IOException {
        CitizenParser parser = new CitizenParser();
        List<Person> allCitizenSortedByEmail = parser.getAllCitizenSortedByEmail("citizen.csv");
        Assertions.assertEquals(allCitizenSortedByEmail.get(0).getEmail(), "Zsa Zsa.Nea@yopmail.com");
    }
}