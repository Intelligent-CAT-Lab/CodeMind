import java.util.Scanner;

public class p02338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 1;
        if (N > K) {
            result = 0;
        }
        System.out.println(result);
    }
}