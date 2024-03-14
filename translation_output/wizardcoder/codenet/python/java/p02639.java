Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x_list = new int[5];
        for (int i = 0; i < 5; i++) {
            x_list[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
```<|endoftext|>
