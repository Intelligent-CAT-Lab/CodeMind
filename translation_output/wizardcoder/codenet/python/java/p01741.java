Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double result = n / 1 + 1;
        if (n * Math.pow(2, 0.5) < result) {
            result = n * Math.pow(2, 0.5);
        }
        System.out.println(result);
    }
}
```<|endoftext|>
