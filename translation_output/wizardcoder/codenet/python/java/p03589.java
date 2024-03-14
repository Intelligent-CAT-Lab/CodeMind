Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
N=int(input())
for h in range(1,3501):
    for n in range(h,3501):
        if 4*n*h-N*h-N*n >0:
            if (N*h*n)%(4*n*h-N*h-N*n)==0:
                w=int((N*h*n)/(4*n*h-N*h-N*n))
                print(h,n,w)
                sys.exit()
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int h = 1; h <= 3500; h++) {
            for (int n = h; n <= 3500; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (int) ((N * h * n) / (4 * n * h - N * h - N * n));
                        System.out.println(h + " " + n + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
```<|endoftext|>
