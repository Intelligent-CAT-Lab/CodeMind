Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
5 -69

```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int minValue = Math.min(A, B);
        int maxValue = Math.max(A + B - N, 0);
        System.out.println(minValue + " " + maxValue);
    }
}
```<|endoftext|>
