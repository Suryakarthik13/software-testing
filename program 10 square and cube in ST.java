import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);

        System.out.println("Square of " + num + " is: " + square);
        System.out.println("Cube of " + num + " is: " + cube);

        sc.close();
    }
}
