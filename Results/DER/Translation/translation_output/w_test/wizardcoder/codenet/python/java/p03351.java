Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
Yes


```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        if (Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
