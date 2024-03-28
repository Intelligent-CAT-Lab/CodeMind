<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```
def dfs(i,sep,s,tot):
    n = len(s)
    i += 1

    # ææ·±é¨ã¾ã§å°éããæ
    if i == n:
        ans = 0
        if len(sep)>1:
            for j in range(len(sep)-1):
                ans += int(s[sep[j]:sep[j+1]])
        ans += int(s[sep[-1]:])
        return ans

    # içªç®ã«+ãå¥ããæ
    sep.append(i)
    tot += dfs(i,sep,s, 0)

    # içªç®ã«+ãå¥ããªãæ
    sep.pop()
    tot += dfs(i,sep,s, 0)

    return tot

s = input()
print(dfs(0,[0],s,0))
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(dfs(0, new ArrayList<>(Arrays.asList(0)), s, 0));
    }

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1)));
            return ans;
        }

        // içªç®ã«+ãå¥ããæ
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå¥ããªãæ
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, and then it prints the result of the `dfs` function. The `dfs` function is a recursive function that calculates the sum of the numbers in the string. It uses a list to keep track of the positions of the separators in the string.
<|EOT|>
