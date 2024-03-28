Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
ABC

```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = (a < 1200)? "ABC" : "ARC";
        System.out.println(result);
    }
}
```<|endoftext|>
