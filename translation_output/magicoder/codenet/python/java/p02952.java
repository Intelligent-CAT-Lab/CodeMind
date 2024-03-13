<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, then counts the number of odd-length strings from 1 to the input number. The count is then printed to the standard output.<｜end▁of▁sentence｜>
