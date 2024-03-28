<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 14 80

Expected output:
3


```
a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then counts how many of the numbers in the range from `a` to `b` (inclusive) are divisors of `c`. The count is then printed to the console.
<|EOT|>
