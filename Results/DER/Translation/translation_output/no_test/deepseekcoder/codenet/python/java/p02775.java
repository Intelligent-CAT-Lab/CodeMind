<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        List<Integer> nums = new ArrayList<>();
        for (int i = n.length() - 1; i >= 0; i--) {
            nums.add(n.charAt(i) - '0');
        }
        nums.add(0);
        int s = 0;
        int res = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            int k = nums.get(i) + s;
            if (k < 5 || (k == 5 && nums.get(i + 1) < 5)) {
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
<|EOT|>
