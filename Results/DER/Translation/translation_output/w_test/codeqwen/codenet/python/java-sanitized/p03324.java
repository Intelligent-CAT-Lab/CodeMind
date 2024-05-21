import java.util.Scanner;

public class p03324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        if (N != 100) {
            System.out.println(100 * Math.pow(10, D) * N);
        } else {
            System.out.println(100 * Math.pow(10, D) * (N + 1));
        }
    }
}