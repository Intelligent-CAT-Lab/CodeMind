Below is the Java translation of the provided Python code, which includes the solve method and a sample test case:

```java
import java.util.Scanner;

public class Solution {

    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        int[] used = new int[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }

        // insert 0 greedy
        int cnt_temp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 1) {
                cnt_temp++;
            } else if (cnt_temp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cnt_temp++;
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }

        int cnt_unused = n;
        for (int element : used) {
            cnt_unused -= element;
        }
        int switch_count = 0;
        // split by other 0
        int st = 0;
        int cnt_1_even = 0;
        int cnt_1_odd = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 0) {
                int switched = (switch_count + 1) / 2;
                int non_switched = cnt_unused - switched;
                res += cnt_1_even * non_switched + cnt_1_odd * switched;
                st = i + 1;
                switch_count++;
                cnt_1_even = 0;
                cnt_1_odd = 0;
            }
            if (t.charAt(i) == '1') {
                if ((i - st) % 2 == 0) {
                    cnt_1_even++;
                } else {
                    cnt_1_odd++;
                }
            }
        }

        // add last
        int switched = (switch_count + 1) / 2;
        int non_switched = cnt_unused - switched;
        res += cnt_1_even * non_switched + cnt_1_odd * switched;

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        int res = solve(t);
        System.out.println(res);
        scanner.close();
    }

    // The test method is not required in Java unless specifically needed, as we generally use testing frameworks like JUnit for testing.
}
```

Please note that in Java, I/O operations and string handling are slightly different from Python. In addition, commented code related to automated tests (`test` method) is not included in Java since testing is usually handled by using a testing framework such as JUnit. If we wish to include test cases within the program, we could manually invoke the `solve` method with the test inputs and compare the outputs, or we could write proper unit tests separately.

Before running the program, please ensure that you have Java installed on your system and that you compile the code with a Java compiler (`javac`). Then you can run the compiled class with the Java interpreter (`java`).
