Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N,M=map(int,input().split())

a,b=1,N//2
c,d=N//2+1,N
if N%2==0:
    a+=1
i=0
while i<M:
    if i<M:
        print(c,d)
        i+=1        
        c,d=c+1,d-1
    else:
        break
    if i<M:
        print(a,b)
        a,b=a+1,b-1
        i+=1
    else:
        break

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int a = 1;
        int b = N / 2;
        int c = N / 2 + 1;
        int d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c += 1;
                d -= 1;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a += 1;
                b -= 1;
                i++;
            } else {
                break;
            }
        }
    }
}
```<|endoftext|>
