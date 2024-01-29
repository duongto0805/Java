package Bai02;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ho va ten");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap ma sinh vien");
        Long maSV = sc.nextLong();

        System.out.println("Nhap diem thi");
        Float diem = sc.nextFloat();
        System.out.println("------------");
        System.out.println("Ho Va Ten: " + hoVaTen);
        System.out.println("Ma Sinh Vien: " + maSV);
        System.out.println("Diem thi: " + diem);

    }

}
