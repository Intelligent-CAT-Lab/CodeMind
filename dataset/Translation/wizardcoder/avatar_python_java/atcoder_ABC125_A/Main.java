import java.util.Scanner;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, T, ans;
        A = sc.nextInt();
        B = sc.nextInt();
        T = sc.nextInt();
        ans = (T / A) * B;
        System.out.println(ans);
    }
}