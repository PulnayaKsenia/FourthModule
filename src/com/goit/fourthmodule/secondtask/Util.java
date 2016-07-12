package com.goit.fourthmodule.secondtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void programBegin() {
        System.out.println("If you need to convert the different scale of temperature,\n" +
                "please, choose the know temperature scale: Celsius or Fahrenheit or enter Out for exit: ");
    }
}
