package com.goit.fourthmodule.firsttask;

public class Main {
    public static void main(String[] args) {

        Triangle v = new Triangle();
        System.out.println("Площадь треугольника v: "+v.squareTriangle());

        Rectangle w = new Rectangle();
        System.out.println("Площадь прямоугольника w: "+w.squareRectangle());

        Circle o = new Circle();
        System.out.println("Площадь круга o: "+o.squareCircle());

    }
}
