package entities;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(){

    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return a;
    }

    public double getSideB(){
        return b;
    }

    public double getSideC(){
        return c;
    }

    public void setAllSides(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setSideA(double a){
        this.a = a;
    }

    public void setSideB(double b){
        this.b = b;
    }

    public void setSideC(double c){
        this.c = c;
    }

    public double calculateArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
