import java.util.Scanner;

public class p01555 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int left = 0;
        int right = (int) Math.pow(10, 18);
        int idx = 0;
        int num = 0;
        String ans = "";

        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }

        idx = calc(left);
        num = left + 1;

        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += String.valueOf(num);
            }
            num++;
        }

        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    private static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        int fr = (int) Math.pow(10, c - 1) - 1;
        int to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }

    private static int[] ds = new int[20];

    static {
        ds[0] = 0;
        for (int i = 1; i < 20; i++) {
            int fr = (int) Math.pow(10, i - 1) - 1;
            int to = (int) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }
    }
}