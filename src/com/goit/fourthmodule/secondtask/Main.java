package com.goit.fourthmodule.secondtask;

public class Main {
    public static void main(String[] args) {

        CelsiusFarenheit v = new CelsiusFarenheit();
        System.out.println("Перевод температуры из градусов Цельсия в градусы по Фаренгейту v: "+v.celsiusFarenheit());

        FarenheitCelsius w = new FarenheitCelsius();
        System.out.println("Перевод температуры из градусо по Фаренгейту в градусы Цельсия w: "+w.farenheitCelsius());
    }
}
