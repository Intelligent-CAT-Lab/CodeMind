<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
67

Expected output:
1


```
n=int(input())
if(n>=65 and n<=90):
    print("1")
elif(n>=97 and n<=122):
    print("2")
else:
    print("0")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else if (n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, and then checks if it falls within the ranges for uppercase letters (65-90), lowercase letters (97-122), or neither. It then prints the corresponding output.<｜end▁of▁sentence｜>
