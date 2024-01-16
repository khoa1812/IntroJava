package docso;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số: ");
        number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Đây không phải số có ba chữ số");
        } else {
            System.out.println(docSo(number));
        }
    }

    private static String docSo(int number) {
        String[] donVi = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] donVix = {"", "mốt", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
        String[] dacBiet = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};

        if (number == 0) {
            return "không";
        }

        if (number < 10) {
            return donVi[number];
        }

        if (number < 20) {
            return dacBiet[number - 10];
        }

        int tram = number / 100;
        int chuc = (number % 100) / 10;
        int dv = number % 10;

        String ketQua = "";
        if (tram > 0) {
            ketQua = donVi[tram] + " trăm ";
        }

        if (chuc > 1) {
            ketQua += donVi[chuc] + " mươi ";
            if (dv > 0) {
                ketQua += donVix[dv];
            }
        } else if (chuc == 1) {
            ketQua += "mười ";
            ketQua += donVi[dv];
        } else {
            if (dv > 0) {
                ketQua += "linh " + donVi[dv];
            }
        }

        return ketQua;
    }
}


