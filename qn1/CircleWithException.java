import java.util.Scanner;

public class CircleWithException {
    private double radius=0;

    public CircleWithException() throws Exception {
        this.setRadius();
    }

    public void setRadius() throws Exception {
        System.out.println("Enter Radius: ");
        Scanner sc = new Scanner(System.in);
        double radius;
        try {
            radius = Double.parseDouble(sc.next());
        } catch (NumberFormatException e) {
            throw new NumberFormatException(" Strings not allowed");
        } catch (NullPointerException e) {
            throw new NullPointerException(" NullPointerError");
        }
        if (radius <= 0) {
            throw new IllegalArgumentException(" Enter number greater than 0");
        }
        if (this.getArea(radius) > 1000) {
            throw new Exception(" Area bigger than 1000");
        }
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(double radius) {
        return radius*radius*Math.PI;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    public double getDiameter(){
        return this.radius*2;
    }

    public void printDimensions(){
        System.out.printf("Radius of circle: %.2f\nArea of circle: %.2f\nDiameter of circle: %.2f\n", this.getRadius(), this.getArea(), this.getDiameter());
    }
}
