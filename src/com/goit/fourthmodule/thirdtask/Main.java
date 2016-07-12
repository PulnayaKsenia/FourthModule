package com.goit.fourthmodule.thirdtask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Runner pointXY = new Runner();
        Point xy = pointXY.readConsole();

        double calculate = xy.calculate();
        System.out.println(calculate);
    }
}
