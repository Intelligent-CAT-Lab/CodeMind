Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if (a <= 100 && b <= 100) {
            double result = (double) a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}
```<|endoftext|>
