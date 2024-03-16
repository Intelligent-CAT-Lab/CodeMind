<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        Arrays.sort(arr);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = arr[2] - arr[i];
            s += tmp / 2;
            arr[i] += (tmp / 2) * 2;
        }

        s += arr[0] % 3 + arr[1] % 3 + arr[2] % 3;

        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, sorts them in ascending order, and then performs the operations described in the Python code. The result is printed to the standard output.
<|EOT|>
