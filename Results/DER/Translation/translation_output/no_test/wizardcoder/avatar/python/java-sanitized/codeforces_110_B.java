import java.util.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = " abcd " * (n / 4) + " abc " + (n % 4 == 0? "" : "abc".substring(0, n % 4));
            System.out.println(s);
        }
    }
}