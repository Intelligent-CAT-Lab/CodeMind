Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-70

```
a,b=map(int,input().split())
print(0 if a<b else 10)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        if(a<b) {
            result = 0;
        } else {
            result = 10;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
