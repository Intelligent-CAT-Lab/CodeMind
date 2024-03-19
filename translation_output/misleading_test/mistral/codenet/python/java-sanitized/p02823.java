import java.util.Scanner;

public class p02823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        if (A - B == 0) {
            result = (B - A) / 2;
        } else {
            result = Math.min(A - 1, N - B) + 1 + (B - A) / 2;
        }
        System.out.println(result);
    }
}