<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
36

Expected output:
8


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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = new StringBuilder(scanner.next()).reverse().toString();
        int[] nums = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            nums[i] = n.charAt(i) - '0';
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
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
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, reverses it, converts it to an array of digits, and then iterates over the array to calculate the result. The result is then printed to the standard output.<｜end▁of▁sentence｜>
