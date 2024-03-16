import java.util.*;
public class atcoder_ABC143_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a - 2 * b;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}