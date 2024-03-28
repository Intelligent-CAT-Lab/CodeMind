import java.util.Scanner;

public class p03632 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B,D) - Math.max(A,C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}