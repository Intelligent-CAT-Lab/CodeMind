Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
-50

```
x,y=map(int,input().split())
print(x if x%y else -1)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = (x % y == 0)? x : -1;
        System.out.println(result);
    }
}
```<|endoftext|>
