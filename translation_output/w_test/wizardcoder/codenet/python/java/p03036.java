Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
30
50
90
170
330
650
1290
2570
5130
10250


```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```<|endoftext|>
