package com.pault.demo.records;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecordDemoApplication {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Paul", "paul@paul.com");

        StudentRecord studentRecord = new StudentRecord("Rory", "rory@rory.com");

    }
}
