Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A=list(map(int,input().split()))

b=abs(A[0]-A[1])+abs(A[0]-A[2])

c=abs(A[0]-A[1])+abs(A[1]-A[2])
d=abs(A[0]-A[2])+abs(A[1]-A[2])

print(min(b,c,d))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            A.add(sc.nextInt());
        }
        int b = Math.abs(A.get(0) - A.get(1)) + Math.abs(A.get(0) - A.get(2));
        int c = Math.abs(A.get(0) - A.get(1)) + Math.abs(A.get(1) - A.get(2));
        int d = Math.abs(A.get(0) - A.get(2)) + Math.abs(A.get(1) - A.get(2));
        System.out.println(Math.min(Math.min(b, c), d));
    }
}
```<|endoftext|>
