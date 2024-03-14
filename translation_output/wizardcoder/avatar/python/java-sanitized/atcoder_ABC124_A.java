import java.util.Scanner;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 2; i > 0; i--) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}