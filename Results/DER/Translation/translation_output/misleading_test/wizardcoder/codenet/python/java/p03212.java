Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
-32

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
        if (s.matches(".*(7|5|3).*")) {
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

In Java, we can use the `Scanner` class to read input from the user. We can then use a recursive function `dfs` to count the number of valid strings that can be formed using the digits 0-9.

The `dfs` function takes two arguments: the maximum value `n` that the string can have, and the current string `s` that we are trying to form.

If the current string `s` is greater than `n`, we know that it cannot be valid, so we return 0.

Otherwise, we check if the current string `s` contains all three digits 7, 5, and 3. If it does, we know that it cannot be valid, so we return 0.

If the current string `s` is valid, we return 1.

Finally, we iterate over the digits 7, 5, and 3, and recursively call `dfs` with the current string `s` concatenated with each digit. We add the result of each recursive call to the current result `ret`.

The base case is when the current string `s` is greater than `n`, in which case we return 0.<|endoftext|>
