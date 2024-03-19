<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        String[] ans = new String[50];
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = String.valueOf(a + i);
        }
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = String.valueOf(a + 50 - b + i + 1);
        }
        System.out.println(String.join(" ", ans));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the quotient and remainder of the integer divided by 50, and then fills an array with the quotient plus the index, and another array with the quotient plus the index plus 50 minus the remainder. Finally, it joins the arrays into a string and prints it.<｜end▁of▁sentence｜>
