import java.util.Scanner;

public class p03417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;
        if (N == 1 && M == 1) {
            result = 1;
        } else if (N == 1 || M == 1) {
            result = N * M - 2;
        } else {
            result = (N - 2) * (M - 2);
        }
        System.out.println(result);
    }
}