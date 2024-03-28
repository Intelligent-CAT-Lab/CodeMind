Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)));
    }
}
```<|endoftext|>
