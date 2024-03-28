<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[1] + numbers[2] - numbers[2]);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, sorts them in ascending order, and then prints the sum of the first two numbers (which are the smallest) minus the largest number.
<|EOT|>
