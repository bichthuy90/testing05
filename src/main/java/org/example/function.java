package org.example;

public class function {
    // Ham duoc su dung khi muon gia tri d9uoc dùng lại ở nhiều nơi
    // Hàm duoc dinh nghia o day (phia tren, ben ngoai main())
    // Co 2 loai
    // 1. ham khong co gia tri tra ve (ham thuc hien logic) - ham phai co chua chu "void"
    // static void tenHam(){}
    static void greeting(){
        System.out.println("Hello Testing");
    }
    // 2. ham co gia tri tra ve
    // static <kieu du lieu> tenHam(){} / Phải có return trả kêt quả về, k có sẽ báo lỗi
    static double dtb(double diemToan, double diemLy, double diemHoa){
        double dtb = (diemToan + diemLy + diemHoa)/3;
        return dtb;
    }
    public static void main(String[] args) {
        //ham khong co gia tri tra ve
        greeting();
        //ham co gia tri tra ve
        double diemToan = 7;
        double diemLy = 8;
        double diemHoa = 9;
        double dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println(dtb);
    }
}
