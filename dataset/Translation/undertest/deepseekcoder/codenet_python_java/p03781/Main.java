import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        double sqrtVal = 8 * x + 1;
        if (Math.floor(sqrtVal) == sqrtVal) {
            double a = (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println((int) a);
        } else {
            double b = (-1 + Math.sqrt(sqrtVal)) / 2;
            System.out.println((int) b + 1);
        }
    }
}