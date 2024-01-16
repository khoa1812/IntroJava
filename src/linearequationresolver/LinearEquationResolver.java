package linearequationresolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất có dạng ax + b = c");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Nghiệm của phương trình x = " + x);
        } else if (b == c) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
