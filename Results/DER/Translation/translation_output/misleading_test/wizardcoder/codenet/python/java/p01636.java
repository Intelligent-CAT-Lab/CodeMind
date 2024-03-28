Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19

Expected output:
57

```
a = input()
ans = 0
for i in range(1, len(a)):
  df = a[:i]
  sm = a[i:]
  if sm[0] == "0":continue
  df = int(df)
  sm = int(sm)
  if (df + sm) % 2 == 0 and sm >= df and (sm - df) % 2 == 0:
    ans += 1
if int(a) % 2 == 0:ans += 1
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < n; i++) {
            String df = n.substring(0, i);
            String sm = n.substring(i);
            if (sm.charAt(0) == '0') continue;
            df = Integer.toString(Integer.parseInt(df));
            sm = Integer.toString(Integer.parseInt(sm));
            if ((Integer.parseInt(df) + Integer.parseInt(sm)) % 2 == 0 && Integer.parseInt(sm) >= Integer.parseInt(df) && (Integer.parseInt(sm) - Integer.parseInt(df)) % 2 == 0) {
                ans++;
            }
        }
        if (n % 2 == 0) ans++;
        System.out.println(ans);
    }
}
```<|endoftext|>
