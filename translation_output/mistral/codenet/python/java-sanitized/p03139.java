import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int minA = Math.min(A, B);
        int maxA = Math.max(A + B - N, 0);
        System.out.println(minA, maxA);
    }
}