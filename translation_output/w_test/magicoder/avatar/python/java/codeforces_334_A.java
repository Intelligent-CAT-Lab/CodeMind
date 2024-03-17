<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
1 36 2 35 3 34
4 33 5 32 6 31
7 30 8 29 9 28
10 27 11 26 12 25
13 24 14 23 15 22
16 21 17 20 18 19


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
            i++;
            j--;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it prints pairs of numbers (i, j) where i and j are consecutive numbers in the range from 1 to n*n. The difference between i and j decreases by 1 in each iteration.<｜end▁of▁sentence｜>
