public class runIShape {
    public static void main(String[] args) {
            IShape r1 = new Rectangle(25,5);
            IShape c1 = new Circle(3);
            IShape[] list = {r1, c1,};
            for (IShape s: list) {
                System.out.println("Dien tich la:" + s.getArea());
                System.out.println("Chu vi la:" + s.getPerimeter());
    }
}
}