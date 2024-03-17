import java.util.Scanner;

public class p02957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        int x = (int) Math.pow(A, 2) - (int) Math.pow(B, 2)
                / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println(x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}