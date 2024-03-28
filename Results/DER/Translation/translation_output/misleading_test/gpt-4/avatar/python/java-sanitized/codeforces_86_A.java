import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long curr = r;
        int s = 0;
        while (curr > 0) {
            s += 1;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] candidates = new long[] {l, r, first, second};
        for (long i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev += (9 - Character.getNumericValue(k));
                }
                ans = Math.max(ans, Long.parseLong(rev) * curr);
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}