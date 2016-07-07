package com.goit.fourthmodule.firsttask;

import java.io.IOException;

public class Runner {

    enum Figures {Circle, Rectangle, Triangle, Out}

    public static void main(String[] args) throws IOException {
        ShapeUtil.programBegin();
        String[] split;

        String figure = ShapeUtil.READER.readLine();
        Figures figures;
        figures = Figures.valueOf(figure);


        switch (figures) {
            case Circle:
                Circle circle = new Circle();
                split = readParams(circle);
                try {
                    circle.setRadius(Double.parseDouble(split[0]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                    readParams(circle);
                }
                break;

            case Triangle:
                Triangle triangle = new Triangle();
                split = readParams(triangle);
                try {
                    triangle.setHeight(Double.parseDouble(split[0]));
                    triangle.setBase(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                    readParams(triangle);
                }
                break;

            case Rectangle:
                Rectangle rectangle = new Rectangle();
                split = readParams(rectangle);
                try {
                    rectangle.setHeightR(Double.parseDouble(split[0]));
                    rectangle.setLength(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                    readParams(rectangle);
                }
                break;

            case Out:
                System.exit(1);
        }
    }


    private static String[] readParams(GeometricFigure figure) throws IOException {
        System.out.println(figure.getInitialParams());
        String inputForGeometricFigure = ShapeUtil.READER.readLine();

        return inputForGeometricFigure.split(",");
    }


}



