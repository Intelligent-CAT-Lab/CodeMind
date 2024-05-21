import java.util.Scanner;

public class p02696 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        int result = (int) Math.floor((double) A * Math.min(B - 1, N) / B);
        System.out.println(result);
    }
}