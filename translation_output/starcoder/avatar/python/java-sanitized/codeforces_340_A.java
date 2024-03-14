import java.util.*;
public class codeforces_340_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = x * y / gcd(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}