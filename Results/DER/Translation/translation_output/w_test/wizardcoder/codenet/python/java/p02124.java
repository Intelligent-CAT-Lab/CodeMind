Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
print("ai1333" + "3" * int(int(input()) / 100))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "ai1333";
        int count = n / 100;
        for (int i = 0; i < count; i++) {
            s += "3";
        }
        System.out.println(s);
    }
}
```<|endoftext|>
