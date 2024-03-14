Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[1]);
        System.out.println(num1 * num2);
    }
}
```<|endoftext|>
