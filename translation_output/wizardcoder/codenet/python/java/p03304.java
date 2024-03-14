Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (d > 0) {
            double area = 2 * ((n - d) * (m - 1)) / Math.pow(n, 2);
            System.out.println(area);
        } else {
            double area = (m - 1) / n;
            System.out.println(area);
        }
    }
}
```<|endoftext|>
