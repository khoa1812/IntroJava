package doitien;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long vnd, usd;
        System.out.println("Nhap so tien USD");
        usd = scanner.nextLong();
        vnd = usd * 23000;
        System.out.println("So tien VND: " + vnd);
    }
}
