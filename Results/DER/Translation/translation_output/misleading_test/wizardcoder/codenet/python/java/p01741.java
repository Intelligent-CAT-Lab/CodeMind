Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
33.29131990083172

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
        double result = n//1+1;
        if(n*2**0.5<n//1+1){
            result = n*2**0.5;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
