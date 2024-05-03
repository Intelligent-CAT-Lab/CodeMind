```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        D();
    }

    //A
    public static void A() {
        String s = new Scanner(System.in).nextLine();
        int a = 0;
        int b = 0;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(b - a);
        return;
    }

    //B
    public static void B() {
        String n = new Scanner(System.in).nextLine();
        int num = 0;
        for (char c : n.toCharArray()) {
            num += Character.getNumericValue(c);
        }
        int n_ = Integer.parseInt(n);
        System.out.println(n_ % num > 0 ? "Yes" : "No");
        return;
    }

    //C
    public static void C() {
        int n = new Scanner(System.in).nextInt();
        int k = new Scanner(System.in).nextInt();
        new Scanner(System.in).nextLine();
        System.out.println((n - k) / (k - 1) + 1 + (n - k) % (k - 1) > 0 ? 1 : 0);
        return;
    }

    //D
    public static void D() {
        int K = new Scanner(System.in).nextInt();
        int ans = 1;
        int i = 0;
        while (K > 0) {
            System.out.println(ans);
            K--;
            if (Check(ans, i)) {
                i++;
            }
            ans += 10 ** i;
        }
        return;
    }

    public static boolean Check(int a, int i) {
        return Sunuke(a + 10 ** i) > Sunuke(ans + 10 ** (i + 
