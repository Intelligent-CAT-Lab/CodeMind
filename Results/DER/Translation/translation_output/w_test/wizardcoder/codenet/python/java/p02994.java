Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2

Expected output:
18


```
def resolve():
    (N, L) = list(map(int, input().split(" ")))
    Ts = []
    offset = L - 1
    absmin = float('inf')
    mini = float('inf')
    for i in range(1, N+1):
        Ts.append(i+offset)
        if abs(i + offset) < absmin:
            absmin = abs(i + offset)
            mini = i + offset
    print(sum(Ts)-mini)
        
    
if '__main__' == __name__:
    resolve()
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Ts[i] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Ts[i];
        }
        System.out.println(sum - mini);
    }
}
```<|endoftext|>
