<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```

### Response:
Here is the Java equivalent of the Python code you provided:

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

This Java code does the same thing as your Python code. It reads an integer from the user, then it sets `i` to 1 and `j` to the square of the input number. It then enters a loop where it prints the current values of `i` and `j`, increments `i` by 1, and decrements `j` by 1. The loop continues until `i` is no longer less than `j`.
<|EOT|>
