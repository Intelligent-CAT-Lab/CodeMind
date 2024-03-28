Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5

Expected output:
5


```
a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```<|endoftext|>
