<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 50 - b; i++) {
            ans.append((a + i) + " ");
        }
        for (int i = 0; i < b; i++) {
            ans.append((a + 50 - b + i + 1) + " ");
        }
        System.out.println(ans.toString().trim());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `K` from the input, prints `50`, calculates `a` and `b` as `K` divided by `50` and the remainder of the division, respectively, and then prints a string of numbers that are `a` plus the index of the number in the first loop, or `a + 50 - b + i + 1` in the second loop. The `StringBuilder` class is used to build the string of numbers, and the `trim()` method is used to remove the trailing space.
<|EOT|>
