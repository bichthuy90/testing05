package org.example;

public class Array {
    public static void main(String[] args) {
        // Khoi tao gia tri
        int[] numbers = {10,15,20,40};
        String[] name = {"A", "B", "C"};
        //                0    1    2
        System.out.println(name[2]);
        // gán lại giá trị cho phần tử trong mang
        name[2] = "An";
        System.out.println(name[2]);

        // Chieu dai cua mang la tong so phan tu co trong mang
        int length = name.length;
        System.out.println("Chieu dai mang: " + length);

        // Duyet mang
        for(int i = 0; i < name.length; i ++) {
            System.out.println("Ten thứ " + (i + 1) + ": " + name[i]);
        }

        // duyet mang dung vong lap for-each (chỉ dùng trong mảng)
        for(int number: numbers){
            System.out.println(number);
        }

        // Nâng cao: duyệt mảng ngược
        for(int index = numbers.length -1; index >= 0; index --){
            System.out.println(numbers[index]);
        }
    }
}
