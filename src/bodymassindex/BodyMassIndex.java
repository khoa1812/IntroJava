package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Nhap weight: ");
        weight = scanner.nextDouble();
        System.out.println("Nhap height: ");
        height = scanner.nextDouble();
        bmi = weight / (height * 2);
        if (bmi >= 18.5) {
            if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            }
            else {
                System.out.println("Obese");
            }
        }
        else {
            System.out.println("Underweight");
        }
    }
}

