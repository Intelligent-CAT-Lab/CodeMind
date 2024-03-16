Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = sc.nextInt();
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```<|endoftext|>
