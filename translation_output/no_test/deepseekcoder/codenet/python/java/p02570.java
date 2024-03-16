<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }
        if ((double)data[0]/data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, stores them in an array, and then checks if the first number divided by the second number is less than or equal to the third number. If it is, it prints "Yes"; otherwise, it prints "No".
<|EOT|>
