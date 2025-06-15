package org.example;

import java.util.Scanner;

public class Main {
    //snippet (chỉ cần gõ main => hiển thị public stactic void main())
    public static void main(String[] args) {
        //lệnh xuất
//        System.out.println("Hello and welcome!");
        //snippet lệnh xuat - gõ sout
//        System.out.println("Hi Testing 05");

        // lệnh nhập
//        Scanner scanner = new Scanner(System.in); // System.in: người dùng nhập vào giá trị gì => gán vào giá trị đó

        //   Biến: là nơi lu trữ dữ liệu
        //   <kiểu dữ liệu> <tên biến> = <giá trị khởi tạo>
        //   Kiểu dữ liệu dạng primative value: byte(-128 - 128 ký tự), short, int, long, float, char,double (dùng cho số thực "có dấu ."), boolean....
        //   Kiểu dữ liệu dạng tham chiếu: string, array, class, object và interface

        int age = 18;
        double salary = 1200.5;
        String name = "My";
        boolean isLogin = true; // (false)

        //   Hằng số - giá trị không đổi (khai báo bắt đầu bằng final <kiểu dữ liệu> <tên biến> = <giá trị hằng số>)
        final double pi = 3.14159;

        //   Yêu cầu: cho phép người dùng nhập vào te mình va xuat ra man hinh
        //   Ô nhập
//        System.out.println("Vui long nhap vao ten: ");
        //   nhan gia tri tu nguoi dung va gán vào biến
//        String uName = scanner.nextLine();
        //   Xuat ra man hinh
//        System.out.println("Xin chao! Ten cua ban la "+ uName);
        //   Yêu cầu: viết chuong trinh cho sinh vien nhap vao ten, lop va tuoi
        //   (tuoi dung kieu int -> gán gia tri vao bien dung scanner.nextInt()) va in ra man hinh

//        System.out.println("Hay nhap vao ten ban: ");
//        String stName = scanner.nextLine();
//        System.out.println("Ban hoc lop nao: ");
//        String stClass = scanner.nextLine();
//        System.out.println("Ban bao nhieu tuoi");
//        int stAge = scanner.nextInt();
//        System.out.println("Xin chào bạn " + stName + " - " + stAge + " tuổi " + "là sinh viên lớp "+ stClass);

// QUY TẮC ĐẶT TÊN BIẾN
// Bắt buộc bắt đầu = chữ cái, KHÔNG được bat dau bang so, KHONG duoc viet co dau tieng viet
// Khong duoc dat trùng với tu khoa cua Java(public, class, void, static,...)
// Dat ten theo quy tac camel case => hoten -> hoTen, tongluong -> tongLuong




    }
}