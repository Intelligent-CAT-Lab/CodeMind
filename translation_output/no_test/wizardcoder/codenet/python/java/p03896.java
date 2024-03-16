Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            String s = "";
            for (int j = 0; j < n - 1; j++) {
                int k = (i - ~(j ^ (n % 2 < (j + 2 < n > i * 2)))) % n + 1;
                s += k;
            }
            System.out.println(s);
        }
    }
}
```<|endoftext|>
