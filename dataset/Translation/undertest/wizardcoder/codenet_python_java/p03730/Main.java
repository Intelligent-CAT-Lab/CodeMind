import java.util.*;

public class p03730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        boolean result = foo(a, b, c);
        System.out.println(result? "YES" : "NO");
    }

    public static boolean foo(int a, int b, int c) {
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                return true;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        return false;
    }
}