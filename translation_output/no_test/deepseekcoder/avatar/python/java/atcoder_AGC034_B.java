<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S = str ( input ( ) )
S = S . replace ( " BC " , " D " )
A_count = 0
ans = 0
for i in range ( len ( S ) ) :
    if S [ i ] == ' A ' :
        A_count += 1
    elif S [ i ] == ' D ' :
        ans += A_count
    else :
        A_count = 0
print ( ans )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        S = S.replace(" BC ", " D ");
        int A_count = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                A_count++;
            } else if (S.charAt(i) == 'D') {
                ans += A_count;
            } else {
                A_count = 0;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the input, replaces all occurrences of " BC " with " D ", then counts the number of 'A's before each 'D' and adds them up. Finally, it prints the total count.
<|EOT|>
