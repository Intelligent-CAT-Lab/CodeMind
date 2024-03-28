```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class ClosestNumber {
    static int n, l, m;
    static int inf = (int) 1e9;
    static int t;
    static int r;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        l = s.length();
        n = Integer.parseInt(s);
        m = inf;
        r = 0;
        t = (int) Math.pow(10, l);

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        Collections.shuffle(nums);

        do {
            int b = 0;
            for (int c : nums) {
                b = b * 10 + c;
            }

            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = b;
            }

        } while (nextPermutation(nums));

        System.out.println(r);
    }

    static boolean nextPermutation(ArrayList<Integer> nums) {
        int k, l;
        for (k = nums.size() - 2; k >= 0; k--) {
            if (nums.get(k) < nums.get(k + 1)) {
                break;
            }
        }

        if (k < 0) {
            return false;
        }

        for (l = nums.size() - 1; l > k; l--) {
            if (nums.get(l) > nums.get(k)) {
                break;
            }
        }

        Collections.swap(nums, k, l);
        Collections.reverse(nums.subList(k + 1, nums.size()));

        return true;
    }
}
```
Test it with the given input and check if it produces the expected output.
