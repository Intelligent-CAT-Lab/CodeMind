Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)
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
        if ((A - B) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else {
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }
    }
}
```<|endoftext|>
