import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(ans);
    }
}