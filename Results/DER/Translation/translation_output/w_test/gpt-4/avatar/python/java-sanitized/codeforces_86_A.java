import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        scanner.close();

        long curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] candidates = {l, r, first, second};

        for (long i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                while(curr > 0) {
                    rev.append(9 - (curr % 10));
                    curr /= 10;
                }
                long revNum = Long.parseLong(rev.toString());
                ans = Math.max(ans, revNum * i);
            }
        }
        System.out.println(ans);
    }
}