<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int dfs(int i, List<Integer> sep, String s, int tot) {
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

        // içªç®ã«+ãå¥ããªãæ
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå¥ããªãæ
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(dfs(0, new ArrayList<>(Arrays.asList(0)), s, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, and then calls the `dfs` function with the appropriate parameters. The `dfs` function performs a depth-first search on the string, and returns the total sum of the integers it finds.<｜end▁of▁sentence｜>
