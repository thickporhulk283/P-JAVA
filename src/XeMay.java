public class XeMay {
    String  hang;
    String dongXe;
    Float gia;
    Integer dongCo;
    Integer tocDoHienTai;
    Boolean dangChay;
    
    public XeMay(String hang, String DongXe, Float gia, Integer DongCo) {
        this.hang = hang;
        this.dongXe = DongXe;
        this.gia = gia;
        this.dongCo = DongCo;
        this.tocDoHienTai = 0;
        this.dangChay = false;

    }
    public void bat(){
        this.tocDoHienTai = 1;
        System.out.println("xe chay");

    }
    public void tat(){
        this.tocDoHienTai = 0;
        System.out.println("xe dung");
    }
    public void thayDoiTocDo(int tocdo){
        this.tocDoHienTai = tocdo;
        System.out.println("Thay doi toc do:" + tocdo);
    }
    public void kiemTraTocDo(){
        if (this.tocDoHienTai == 0)
        {
//            this.DangChay = false ;
            System.out.println("Xe dung");
        }else {
//            this.DangChay = true;
            System.out.println("Xe dang chay");
        }
        }
        @Override
        public String toString() {
            return "XeMay{" +
                    "hang='" + hang + '\'' +
                    ", DongXe='" + dongXe + '\'' +
                    ", gia=" + gia +
                    ", DongCo=" + dongCo +
                    ", TocDoHienTai=" + tocDoHienTai +
                    ", DangChay=" + dangChay +
                    '}';
        }
        public static void main(String[] args) {
            XeMay XeMay3 = new XeMay("Yamaha,", "XeSo", 1888888.3f, 175);
            XeMay3.bat();
            XeMay3.thayDoiTocDo(0);
            XeMay3.kiemTraTocDo();
            System.out.println(XeMay3);
        
    }
}
