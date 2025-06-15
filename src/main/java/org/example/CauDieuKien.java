package org.example;

public class CauDieuKien {
    public static void main(String[] args) {
//        Câu lệnh
//        if(dieu kien){thuc hien logic}
//        điều kiện sai
//        if(9 > 2){
//            System.out.println("Điều kiện đúng");
//        }
//        điều kiện sai
//        if(2 > 9){
//            System.out.println("Điều kiện đúng");
//        }
//        Viet chuong trinh xem hom nay co phai ngay di hoc khong?
//        int day = 4;
//        if (day == 4 || day ==8){
//            System.out.println("Hôm nay là ngày đi học");
//        }

//        Câu if...else
//        if(điều kiện){thực hiện logic1} else {thực hiện logic2}

        int a = 8;
        int b = 10;
        if(a > b){
            System.out.println("Số a lớn hơn số b");
        }else {
            System.out.println("So b lon hon so a");
        }


//        if(dieu kiện 1) {thực hiện logic1}else if(điều kiện 2){thực hiện logic2}else{thực hiện logic3}

        int c = 10;
        if(c == 10) {
            System.out.println("SỐ 10");
        }else if (c == 11) {
            System.out.println("số 11");
        }else if (c == 12) {
            System.out.println("Số 12");
        }else {
            System.out.println("vui lòng nhập lại số");
        }



//    switch case

//        switch (gia tri dem di so sanh) {
//        case gia tri so sanh
//                thuc hien logic
//                break
//    }

        int t = 10;
        switch (t){
            case 5:
                System.out.println("SO 5");
                break;
            case 10:
                System.out.println("SO 10");
                break;
            default:
                System.out.println("Vui long kiem tra lai");
        }


//    Luu y: nên sử dụng khi switch case - gia tri so sanh la gia tri cu the, dieu kien don gian (==)

    }

}
