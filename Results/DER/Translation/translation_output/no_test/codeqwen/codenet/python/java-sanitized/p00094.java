import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}