Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        int minAB = Math.min(A, B);
        int maxAB = Math.max(A + B - N, 0);
        System.out.println(minAB + " " + maxAB);
    }
}
```<|endoftext|>
