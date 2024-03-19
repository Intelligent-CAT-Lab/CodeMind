<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
84
3''1LZ'

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
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50, b = K % 50;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 50 - b; i++) {
            ans.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            ans.append(a + 50 - b + i).append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, prints `50`, calculates `a` and `b`, and then prints a string of numbers that is a combination of `a` and `b`. The numbers are separated by spaces.
<|EOT|>
