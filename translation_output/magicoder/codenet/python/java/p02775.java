<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
        String input = scanner.next();
        int[] n = new int[input.length() + 1];
        for (int i = 0; i < input.length(); i++) {
            n[i] = input.charAt(input.length() - 1 - i) - '0';
        }
        n[input.length()] = 0;
        int s = 0;
        int res = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int k = n[i] + s;
            if (k < 5 || (k == 5 && n[i + 1] < 5)) {
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

This Java code does the same thing as the Python code. It reads a number from the user, reverses it, and then adds a zero to the end. It then iterates over the reversed number, adding the current digit plus the carry from the previous digit to the result. If the sum is less than 5 or equal to 5 and the next digit is less than 5, it adds the current digit to the result and resets the carry. Otherwise, it adds 10 minus the current digit plus the carry to the result and sets the carry to 1. Finally, it adds the carry to the result and prints the result.<｜end▁of▁sentence｜>
