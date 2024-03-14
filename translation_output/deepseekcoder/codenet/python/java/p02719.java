<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int rot = n/k;

        int x = n;

        if (k == 1 || n == k || n%k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k*rot;
        }

        int t = x%k;

        System.out.println(Math.min(t, Math.abs(t-k)));
    }
}
```
<|EOT|>
