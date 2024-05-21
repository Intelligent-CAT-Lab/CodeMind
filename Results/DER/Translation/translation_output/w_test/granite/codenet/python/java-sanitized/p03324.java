import java.util.Scanner;

public class p03324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        int result = (int) Math.pow(100, D) * N;
        if (N == 100) {
            result = result + (int) Math.pow(100, D);
        }
        System.out.println(result);
    }
}