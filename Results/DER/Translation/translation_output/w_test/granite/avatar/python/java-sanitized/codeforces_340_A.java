import java.util.*;

public class codeforces_340_A {
    public static int GCD(int a, int b) {
        while (a % b!= 0) {
            a = b;
            b = a % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" â ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        int lcm = LCM(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}