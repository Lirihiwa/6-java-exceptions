package com.example.task06;

import java.util.logging.Logger;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];

        System.out.println(stackTraceElement.getMethodName());
    }

}