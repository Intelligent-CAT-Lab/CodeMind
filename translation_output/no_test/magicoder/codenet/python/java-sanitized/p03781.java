import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        double sqrtValue = 8 * x + 1;
        double sqrt = Math.sqrt(sqrtValue);
        if (sqrt == Math.floor(sqrt)) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (int) (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(x + 1);
        }
    }
}