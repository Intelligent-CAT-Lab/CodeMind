import java.util.Scanner;

public class p03632 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int ans = Math.max(A,C) - Math.min(B,D);

        if(ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}