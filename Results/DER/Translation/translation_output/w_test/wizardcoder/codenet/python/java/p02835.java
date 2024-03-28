Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
win


```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
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
        if (a+b+c<22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```<|endoftext|>
