public class Dkmmn {
    public static void main(String[] args) throws InterruptedException {
        // Đặt thời gian đếm ngược
        int countdown = 10;

        while (countdown > 0) {
            System.out.println(countdown);
            Thread.sleep(1000); // chờ 1 giây
            countdown -= 1;
        }

        System.out.println("Hết giờ!");
    }
}

