import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 100 && b <= 100) {
            System.out.println(String.format("%.4f", (double) a * b / 3.305785));
        }
    }
}