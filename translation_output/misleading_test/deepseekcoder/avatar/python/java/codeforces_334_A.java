<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
1 36
2 35
3 34
4 33
5 32
6 31
7 30
8 29
9 28
10 27
11 26
12 25
13 24
14 23
15 22
16 21
17 20
18 19


```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```

### Response:
Here is the Java version of the Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the standard input, then prints pairs of numbers (i, j) where i and j are consecutive integers and i < j. The difference between the Python and Java versions is that Java uses `Scanner` to read the input and `System.out.println` to print the output, while Python uses `input` and `print`.
<|EOT|>
