Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a*a);
    }
}
```<|endoftext|>
