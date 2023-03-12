package NBT;

public class RunShape {
    public static void main(String[] args) {
        Circle      c1 = new Circle(3);
        Rectangle   r1 = new Rectangle(2,4);
        Square      s1 = new Square(5);
        System.out.println(c1);
        System.out.println(" dien tich la "+c1.getArea()+"\n chu vi la "+c1.getPerimeter());
        System.out.println(r1);
        System.out.println(" dien tich la "+r1.getArea()+"\n chu vi la "+r1.getPerimeter());
        System.out.println(s1);
        System.out.println(" dien tich la "+s1.getArea()+"\n chu vi la "+s1.getPerimeter());
        System.out.println();

      
    }
    
}
