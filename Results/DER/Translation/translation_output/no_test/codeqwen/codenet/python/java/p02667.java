Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        System.out.println(solve(t));
    }

    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        boolean[] used = new boolean[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        // insert 0 greedy
        int cnt_temp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                cnt_temp += 1;
            } else if (cnt_temp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cnt_temp += 1;
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        int cnt_unused = n - sum(used);
        int switch_count = 0;
        // split by other 0
        int st = 0;
        int cnt_1_even = 0;
        int cnt_1_odd = 0;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                int switched = (switch_count + 1) / 2;
                int non_switched = cnt_unused - switched;
                res += cnt_1_even * non_switched + cnt_1_odd * switched;
                st = i + 1;

