import java.util.*;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int result = (int) Math.pow(m, n) % mod;
        System.out.println(result);
    }
}