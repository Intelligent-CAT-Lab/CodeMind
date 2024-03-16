Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ij = ij(n);
        System.out.println(ij[0] + ij[1] - 2);
    }

    public static int[] ij(int n) {
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                return new int[]{i, n/i};
            }
        }
        return new int[]{0, 0};
    }
}
```<|endoftext|>
