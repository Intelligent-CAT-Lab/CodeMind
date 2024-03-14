Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            df = df.replaceAll("\\D", "");
            sm = sm.replaceAll("\\D", "");
            if (df.equals("") || sm.equals("")) continue;
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans++;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans++;
        System.out.println(ans);
    }
}
```<|endoftext|>
