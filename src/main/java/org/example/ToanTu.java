package org.example;

public class ToanTu {
    public static void main(String[] args) {
// Cong, tru, nhan, chia
    int a = 18;
    int b = 4;

//    Tong
    int tong = a + b;
//    Hieu
    int hieu = a - b;
//    Tich
    int tich = a * b;
//    Thuong
    int thuong = a / b;
//    Chia lấy dư
        float a1 = a;
        float b1 = b;
    float chialayphandu = a1 % b1;

    System.out.println("Tong: " + tong);
    System.out.println("Hieu: " + hieu);
    System.out.println("Tich: " + tich);
    System.out.println("Thuong: " + thuong);
    System.out.println("Lay du: " + chialayphandu);

    // tien to va hau to
    // tien to
        System.out.println(++a);
        int c = 10;
        int d = c;
        System.out.println(d++);
        System.out.println(d);
    // toan tu so sanh
        // toan tu so sanh  gia tri (==)
    int j = 10;
    int k = 15;
    boolean sosanh = j == k;
    System.out.println(sosanh); // => flase
        // toan tu so sanh khong bang (!=)

    boolean sskhongbang = j!=k;
    System.out.println(sskhongbang); // => true
        // so sanh > < >= <=

        // toan tu logic
            // and (&&)
        boolean rs1 = (10 == 15) && (15 == 15);
        System.out.println(rs1); // => false
           // or (||)
        boolean rs2 = (10 == 15) || (15 == 15);
        System.out.println(rs2); // => true
           // phủ định (!)
        boolean rs3 = !(2>1);
        System.out.println(rs3); // => false



    }

}
