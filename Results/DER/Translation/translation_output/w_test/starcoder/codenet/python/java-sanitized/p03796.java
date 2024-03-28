import java.util.*;
public class p03796 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = (res * i) % 1000000007;
        }
        return res;
    }
}