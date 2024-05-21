import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long curr = r;
        long s = 0;
        while (curr > 0) {
            s += 1;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        for (long i : new long[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                while (curr > 0) {
                    rev.append(9 - curr % 10);
                    curr /= 10;
                }
                ans = Math.max(ans, Long.parseLong(rev.toString()) * i);
            }
        }
        System.out.println(ans);
    }
}