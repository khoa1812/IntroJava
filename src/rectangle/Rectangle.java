package rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Chiều dài: ");
        width = sc.nextFloat();

        System.out.println("chiều cao: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Diện tích hình chữ nhật: " + area);
    }
}
