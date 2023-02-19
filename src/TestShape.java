public class TestShape {
        public static void main(String[]args){
            Shape r1 = new HinhChuNhat(25,5);
            Shape c1 = new HinhTron(3);
            Shape r2 = new HinhChuNhat(10, 2);
            Shape c2 = new HinhTron(77);
            Shape[] list = {r1, c1, r2, c2};
            for (Shape s: list) {
                System.out.println("Dien tich la:" + s.getArea());
            }
        }
    }
    

