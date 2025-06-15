package org.example;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
    // Yeu cau: viet chuong trinh tinh luong cho phep nguoi dung nhap vao ten, luong 1 ngay, tong so ngay lam va in ra ket qua ra man hinh
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên nhân viên:");
//        String name = scanner.nextLine();
//        System.out.println("Lương 1 ngày công của " + name);
//        float luong = scanner.nextInt();
//        System.out.println("Tổng số ngày làm của " + name);
//        int ngaycong = scanner.nextInt();
//        float tongluong = luong * ngaycong;
//        System.out.println("Nhân viên " + name + " hưởng mức lương 1 ngày công là: " + tongluong + " nghìn đồng." + "\n"  + "Tổng số lương mà " + name + " nhận được là: " + tongluong  + " đồng.");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên sinh viên:");
//        String name = scanner.nextLine();
//        System.out.println("Nhập vào điểm Toán: ");
//        float monToan = scanner.nextFloat();
//        System.out.println("Nhập vào điểm Lý: ");
//        float monLy = scanner.nextFloat();
//        System.out.println("Nhập vào điểm Hóa: ");
//        float monHoa = scanner.nextFloat();
//        float diemTB = (monToan + monLy + monHoa) / 3;
//        System.out.println("Sinh viên " + name + " có điểm trung bình 3 môn là: " + diemTB);


//        VIet chuong trinh cho phep nguoi dung nhap vao so tuoi, kiem tra xem đa du tuoi hoc dai hoc chua (> 18t)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao tuoi cua ban: ");
//        int soTuoi = scanner.nextInt();
//
//        if(soTuoi > 18){
//            System.out.println("Ban da du tuoi hoc dai hoc");
//        }else {
//            System.out.println("Ban chua du tuoi hoc dai hoc");
//        }
//        Toan tu 3 ngôi -> điều kiện ? thực hiện logic1 : thực hiện logic2

//        String result = (soTuoi > 18) ? "Ban du tuoi hoc dai hoc" : "Ban chua du tuoi hoc dai hoc";
//        System.out.println(result);

//        Viết chuong trinh kiem tra hoc sinh, cho phep nhap vao diem toan, ly, hoa, sau đó tính trung binh. Neu diem trung binh <5 -> hoc sinh yeu
//        5.1-6: hs trung binh
//        6.1-7: hs kha
//        7.1-8: hs gioi
//        8.1-10: hs xuat sac

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhap vao diem toan: ");
//        float diemToan = scanner.nextFloat();
//        if (diemToan < 0 || diemToan > 10) {
//            System.out.println("Vui long nhap thang điểm từ 0 -10");
//            diemToan = scanner.nextFloat();
//        }
//
//        System.out.println("Nhap vao diem ly: ");
//        float diemLy = scanner.nextFloat();
//
//        if (diemLy < 0 || diemLy > 10) {
//            System.out.println("Vui long nhap thang điểm từ 0 -10");
//            diemLy = scanner.nextFloat();
//        }
//
//        System.out.println("Nhap vao diem Hoa: ");
//        float diemHoa = scanner.nextFloat();
//
//        if (diemHoa < 0 || diemHoa > 10) {
//            System.out.println("Vui long nhap thang điểm từ 0 -10");
//            diemHoa = scanner.nextFloat();
//        }
//
//        float diemTb = (diemToan + diemLy + diemHoa) / 3;
//        System.out.println("\n" + "Điểm trung bình: " + diemTb);
//
//        if (diemTb >= 0 && diemTb < 5 ){
//            System.out.println("Hoc sinh yeu");
//        }else if (diemTb >= 5 && diemTb <= 6) {
//            System.out.println("Hoc sinh trung binh");
//        }else if (diemTb >= 6.1 && diemTb <= 7) {
//            System.out.println("Hoc sinh kha");
//        }else if (diemTb >= 7.1 && diemTb <=8 ) {
//            System.out.println("Hoc sinh gioi");
//        }else if (diemTb >= 8.1 && diemTb <=10 ) {
//            System.out.println("Hoc sinh xuat sac");
//        } else {
//            System.out.println("Kiem tra lai so diem");
//        }


//        Tính tiền điện
//        Viet chuong trinh nhap vao thong tin tieu thu dien (ten, so kw)
//        TInh và xuat Tien tra theo quy tac:
//        + 50kw đầu: 500d/kw
//        + 50kw kw kế : 650d/kw
//        + 100kw kế: 850d/kw
//        + 150kw kế: 1100d/kw
//        + Còn lại: 1300d/kw

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhap vao so Kw điện: ");
//        float soDien = scanner.nextFloat();
//        float tienDien = 0;
//        if (soDien > 0 && soDien <= 50 ){
//            tienDien = soDien * 500;
//        } else if (soDien > 50 && soDien <= 100) {
//            tienDien = (50 * 500) + ((soDien - 50) * 650);
//        } else if (soDien > 100 && soDien <= 200) {
//            tienDien = (50 * 500) + (50 * 650) + ((soDien -100) * 850);
//        } else if (soDien > 200 && soDien <=350) {
//            tienDien = (50 * 500) + (50 * 650) + (100 * 850) + ((soDien - 200) * 1100);
//        } else if (soDien > 350){
//            tienDien = (50 * 500) + (50 * 650) + (100 * 850) + (150 * 1100) + ((soDien - 350) * 1300);
//        } else {
//            System.out.println("Vui lòng nhập lại so Kw");
//        }
//        System.out.println("Tong tien dien: " + tienDien);


//        Bai tap vong lap
//        1. viet chuong trinh cho phep nguoi dung nhap vao so N, tinh tong so tu 1 den N

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban hay nhap vao so n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for(int i = 1; i <= n; i++ ){
            tong = tong + i; // hoac tong += i;
        }
        System.out.println("Tong day so tu 1 den " + n + " la: " + tong);


//        2. viet chuong trinh cho phep nguoi dung nhap vao so N, tinh tong so chan tu 0 den N
        System.out.println("Moi ban nhap vao so m: ");
        int m = scanner.nextInt();
        int tongsochan = 0;
        for(int j = 0; j <= m; j++){
            if(j % 2 == 0){
                tongsochan = tongsochan + j; // hoac tongsochan += j;
            }
        }
        System.out.println("Tong so chan trong day so tu 1 den " + m + " là: " + tongsochan);
        // Cách 2 cho bai tap 2
        System.out.println("Moi ban nhap vao so m1: ");
        int k = scanner.nextInt();
        int tongsochan1 = 0;
        for(int o = 0; o <= k; o+=2){
            tongsochan1 = tongsochan1 + o; // hoac tongsochan += o;
        }
        System.out.println("Tong so chan trong day so tu 1 den " + m + " là: " + tongsochan);

        // *** Tính tổng số chẵn thì cho giá tri trong vong lap bat dau = 0 (giá trị thay đổi là: +=2)
        // *** Tính tổng số lẻ thì cho giá tri trong vong lap bat dau = 1 (giá trị thay đổi là: +=2)
        // *** Chia het cho 3 thì cho giá tri trong vong lap bat dau = 3 (giá trị thay đổi là: +=3)
    }
}
