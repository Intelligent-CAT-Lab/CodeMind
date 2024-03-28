import java.util.Scanner;

public class p02705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.close();

        double result = input * 6.28;
        System.out.printf("%.20f", result);
    }
}