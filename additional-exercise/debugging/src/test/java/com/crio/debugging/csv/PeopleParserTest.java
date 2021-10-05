package com.crio.debugging.csv;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class PeopleParserTest {

    @Test
    void printAllEmployeeNameAndPhoneNumbers() throws IOException {
        PeopleParser parser = new PeopleParser();
        parser.printAllPeopleNameAndProfession("people.csv");
    }
}