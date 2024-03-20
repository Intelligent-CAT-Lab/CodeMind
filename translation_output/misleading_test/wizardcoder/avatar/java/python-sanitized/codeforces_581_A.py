import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (a > 0 and b > 0):
            count += 1;
            a -= 1;
            b -= 1;
        int ans = a // 2 + b // 2;
        System.out.println(count + " " + ans);
    }
}