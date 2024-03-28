import java.util.*;
public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int da = sc.nextInt();
        int db = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println(" YES ");
                    return;
                }
            }
        }
        System.out.println(" NO ");
    }
}