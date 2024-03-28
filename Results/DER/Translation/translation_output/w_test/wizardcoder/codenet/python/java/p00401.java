Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54

Expected output:
32


```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count/2));
    }
}
```<|endoftext|>
