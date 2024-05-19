System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
19

```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 1; b <= x; b++) {
            for (int p = 2; b * Math.pow(b, p) <= x; p++) {
                ans = Math.max(ans, (int) Math.pow(b, p));
            }
        }
        System.out.println(ans);
    }
}
```

You can run this code with the following test case:

```
10
```

Expected Output:
```
19
```<|endoftext|>
