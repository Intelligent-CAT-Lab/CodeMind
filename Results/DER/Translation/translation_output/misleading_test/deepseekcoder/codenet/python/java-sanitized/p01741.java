import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        int intN = (int)n;
        double result = intN + 1;
        if (sqrtN < result) {
            result = sqrtN;
        }
        System.out.println(result);
    }
}