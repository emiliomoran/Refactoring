/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements.bad;

/**
 *
 * @author Moises
 */
public class Client {

    private double a;
    private double b;
    private double r;
      
    public double calculateArea(int shape) {
        double area = 0;
        switch (shape) {
            case SQUARE:
                area = a * a;
                break;
            case RECTANGLE:
                area = a * b;
                break;
            case CIRCLE:
                area = Math.PI * r * r;
                break;
        }
        return area;
    }

    public double calculatePerimeter(int shape) {
        double perimeter = 0;
        switch (shape) {
            case SQUARE:
                perimeter = 4 * a;
                break;
            case RECTANGLE:
                perimeter = 2 * (a + b);
                break;
            case CIRCLE:
                perimeter = 2 * Math.PI * r;
                break;
        }
        return perimeter;
    }
}
