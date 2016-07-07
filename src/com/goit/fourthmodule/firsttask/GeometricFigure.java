package com.goit.fourthmodule.firsttask;

abstract class GeometricFigure {

    public abstract String getFigureType();

    public abstract String getInitialParams();

    public abstract double calculate();

    @Override
    public String toString() {
        return "Please, enter initial params (coma is delimiter) for " + getFigureType() + " with next params: "
                + getInitialParams();
    }
}
