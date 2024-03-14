Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] list = {A+B, 2*A-1, 2*B-1};
        int max = list[0];
        for(int i=1; i<list.length; i++) {
            if(list[i] > max) {
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
```<|endoftext|>
