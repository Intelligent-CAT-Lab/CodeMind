import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of a and b: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);

        if (a <= 100 && b <= 100) {
            double result = (double) a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}