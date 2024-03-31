package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        if (StringUtils.equals("Hello", "Hello")) {
            System.out.println("Hello world!");
        } else {
            System.out.println("Nothing to hello");
        }

    }
}