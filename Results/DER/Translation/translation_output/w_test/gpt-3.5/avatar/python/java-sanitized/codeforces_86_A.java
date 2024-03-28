import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();

        long curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }

        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] values = {l, r, first, second};

        for (long i : values) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                for (char digit : Long.toString(curr).toCharArray()) {
                    rev.append((char) (9 - (digit - '0') + '0'));
                }
                long reverse = Long.parseLong(rev.toString());
                ans = Math.max(ans, reverse * curr);
            }
        }

        System.out.println(ans);
    }
}