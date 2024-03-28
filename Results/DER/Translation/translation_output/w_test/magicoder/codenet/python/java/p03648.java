<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


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

@@ Response
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
            ans.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            ans.append(a + 50 - b + i + 1).append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the quotient and remainder when dividing the integer by 50, and then prints the string representation of the integer 50 followed by a space, followed by the string representation of the numbers in the list `ans`. The list `ans` is constructed in the same way as in the Python code.<｜end▁of▁sentence｜>
