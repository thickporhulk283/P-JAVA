

public abstract class Pizza implements IShape{
    private double price;
    private IShape shape;

    public Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;

    }
    public double getPrice() {
        return price;
    }
    
    public IShape getShape() {
        return shape;
    }
    @Override
    public String toString() {
        String shapeName = shape instanceof Circle ? "Circle" : "Rectangle";
        return "Pizza with " + shapeName + " shape" + ", price: " + price;
    }
     
}


