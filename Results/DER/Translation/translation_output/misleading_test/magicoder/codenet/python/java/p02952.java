<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
74

```
n=int(input())
ans=0
for i in range(n):
  hoge=str(i+1)
  if(len(hoge)%2==1):
    ans+=1
print(ans)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String hoge = String.valueOf(i + 1);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates from 0 to n-1 (inclusive), converts each number to a string, and checks if the length of the string is odd. If it is, it increments the answer. Finally, it prints the answer.<｜end▁of▁sentence｜>
