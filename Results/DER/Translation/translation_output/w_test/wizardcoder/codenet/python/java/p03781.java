Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(Math.floor(a));
        } else {
            int x1 = (-1 + (int) Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(x1 + 1);
        }
    }
}
```<|endoftext|>
