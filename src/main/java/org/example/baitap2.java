package org.example;

import java.util.Scanner;

public class baitap2 {

    static double tongLuong(double soNgay, double soTien){
        double tongLuong = (soNgay * soTien);
        return tongLuong;
    }

    static double diemTrungbinh(double diemToan, double diemLy, double diemHoa){
        double diemTb = (diemToan + diemLy + diemHoa)/3;
        return diemTb;
    }

    static String xepLoai(double diem){
        String result = "";
        if (diem >= 0 && diem <= 5 ){
            result = "Hoc sinh yeu";
        }else if (diem >= 5.1 && diem <= 6) {
            result = "Hoc sinh trung binh";
        }else if (diem >= 6.1 && diem <= 7) {
            result = "Hoc sinh kha";
        }else if (diem >= 7.1 && diem <=8 ) {
            result = "Hoc sinh gioi";
        }else if (diem >= 8.1 && diem <=10 ) {
            result = "Hoc sinh xuat sac";
        } else {
            result = "Vui lòng nhập lại";
        }
        return result;
    }

    public static void main(String[] args) {
        // BAI TAP 1
        // viet chuong trinh tinh luong, cho phep nguoi dung nhap vao so ngay lam va so tien 1 ngay.
        // biet tong luong = so ngay lam * so tien 1 ngay. (Luu y: tach ham ra xu ly)

        // Phân tích bài toán theo
        // Mo hinh IPO
        // input: gia tri tu phia nguoi dung nhap
        // * tong so ngay lam, so tien lam 1 ngay
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so ngay lam: ");
        double soNgay = scanner.nextDouble();
        System.out.println("Nhap vao tien luong 1 ngay: ");
        double soTien = scanner.nextDouble();
        // process: gia tri tu nguoi dung nhap di thuc hien logic yeu cau cua bai toan
        // * tongLuong = tong so ngay lam * so luong 1 ngay
        double tongLuong = tongLuong(soNgay,soTien);
        // output: gia tri dau ra tu yeu cau cua đề
        // * sout("....")
        System.out.println(tongLuong);

        // BAI TAP 2
        // Viet chuong trinh danh gia hoc sinh, cho phep nhap vao Toan, Ly, Hoa. Tính diem trung binh va danh gia hoc sinh
        // <= 5: hs yeu
        // 5.1 - 6: hs trung binh
        // 6.1 - 7: hs kha
        // 7.1 - 8: hs gioi
        // 8.1 - 10: hs xuat sac
        // Luu y: tach ham tinh diem trung binh va tach ham xep loai

        System.out.println("Nhap vao diem Toan: ");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhap vao diem Ly: ");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhap vao diem Hoa:");
        double diemHoa = scanner.nextDouble();
        double diemTB = diemTrungbinh(diemToan,diemLy,diemHoa);
        String danhGia = xepLoai(diemTB);
        System.out.println("Diem trung binh 3 mon la: " + diemTB);
        System.out.println(danhGia);

    }
}
