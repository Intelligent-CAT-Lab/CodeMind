<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
36

Expected output:
15

```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)


if __name__ == '__main__':
    main()
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        Arrays.fill(nums, 0);
        int res = 0;
        for (int i = 0; i < n; i++) {
            nums[n - i] = sc.nextInt();
        }
        int s = 0;
        for (int i = 0; i < n - 1; i++) {
            int k = nums[i] + s;
            if (k < 5 || (k == 5 && nums[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```</s>
