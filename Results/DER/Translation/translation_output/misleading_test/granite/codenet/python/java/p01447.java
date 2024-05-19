System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
-81

```
n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
    ans+=1
print(ans)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

Test input:
8

Expected output:
-81<|endoftext|>
