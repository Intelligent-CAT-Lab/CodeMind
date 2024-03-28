Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
81 58

Expected output:
110


```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int fare = (ab + bc/2);
        System.out.println(fare);
    }
}
```<|endoftext|>
