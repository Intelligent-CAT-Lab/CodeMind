<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i += 1;
            j -= 1;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then it initializes two variables `i` and `j` to 1 and `n * n` respectively. It then enters a loop where it prints the current values of `i` and `j`, increments `i` by 1, and decrements `j` by 1. The loop continues until `i` is no longer less than `j`.<｜end▁of▁sentence｜>
