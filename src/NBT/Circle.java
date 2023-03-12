package NBT;

public class Circle extends Shape {
    private double radius;

    
    public Circle() {
        super();
    }

   
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

  
    public Circle (double radius, String color, boolean filled) {
        this(radius);
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius; 
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
    }

   
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+radius
             + ", la lop con cua "+super.toString();
    }
}



