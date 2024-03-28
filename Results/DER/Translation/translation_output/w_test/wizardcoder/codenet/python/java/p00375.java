Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = (x-30)/2;
        System.out.println(y);
    }
}
```<|endoftext|>
