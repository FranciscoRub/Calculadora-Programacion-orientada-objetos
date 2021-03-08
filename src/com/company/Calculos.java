package com.company;

public class Calculos {

   private double num1;
   private double num2;
    private double multiplicacion;
    private double division;
    private double suma;
    private double resta;



    public Calculos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Getter
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getMultiplicacion() {
        return num1 * num2;
    }

    public double getDivision() {
        return num1 / num2;
    }

    public double getSuma() {
        return num1 + num2;
    }

    public double getResta() {
        return num1-num2;
    }


}
