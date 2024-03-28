import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        double result = 1 / ((r2 + r1) / (r1 * r2));
        System.out.println(result);
    }
}