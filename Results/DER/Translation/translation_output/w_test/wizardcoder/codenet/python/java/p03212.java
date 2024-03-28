Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
4


```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = dfs(n, "0");
        System.out.println(res);
    }

    public static int dfs(int n, String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        if (s.matches(".*7.*|.*5.*|.*3.*")) {
            ret = 0;
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(n, s + c);
        }
        return ret;
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use a recursive function `dfs` to count the number of valid numbers that can be formed using the digits 0-9.

The `dfs` function takes two arguments: `n` is the maximum number we want to form and `s` is the current string we are forming.

If the current string `s` is greater than `n`, we return 0 because we cannot form a number greater than `n`.

If the current string `s` matches the regular expression `.*7.*|.*5.*|.*3.*`, we know that it cannot form a valid number because it contains a digit that is not 7, 5, or 3. In this case, we return 0.

Otherwise, we return 1 because we have found a valid number that starts with `s`. We then recursively call `dfs` on each of the digits 7, 5, and 3 to form the remaining digits of the number.

Finally, we add up the results of all the recursive calls to get the total number of valid numbers that can be formed.<|endoftext|>
