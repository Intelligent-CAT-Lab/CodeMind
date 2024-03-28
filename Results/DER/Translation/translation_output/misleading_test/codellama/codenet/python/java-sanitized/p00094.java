import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a <= 100 && b <= 100) {
            double result = a * b / 3.305785;
            System.out.println(String.format("%.4f", result));
        }
    }
}