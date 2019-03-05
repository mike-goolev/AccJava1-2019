package shapesarefun;

public class Circle extends Shape {
    
    private int radius;

    public Circle() {
        this.radius = 3;
    }
    
    public Circle(int radius) {
        this();
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
    
    public static double calcArea(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
    
    public static double calcPerimeter(Circle c) {
        return c.radius * 2 * Math.PI;
    }
    
    // ** STANDARD GETTERS AND SETTERS

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
}
