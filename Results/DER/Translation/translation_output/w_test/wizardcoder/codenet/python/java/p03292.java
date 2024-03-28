Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
5


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
        int[] A = new int[3];
        for(int i=0;i<3;i++){
            A[i] = sc.nextInt();
        }
        int b = Math.abs(A[0]-A[1])+Math.abs(A[0]-A[2]);
        int c = Math.abs(A[0]-A[1])+Math.abs(A[1]-A[2]);
        int d = Math.abs(A[0]-A[2])+Math.abs(A[1]-A[2]);
        System.out.println(Math.min(b,Math.min(c,d)));
    }
}
```<|endoftext|>
