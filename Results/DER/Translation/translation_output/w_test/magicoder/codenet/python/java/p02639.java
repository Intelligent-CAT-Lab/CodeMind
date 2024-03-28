<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
1


```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] x_list = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x_list[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < x_list.length; i++) {
            if (x_list[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores them in an array. Then it iterates over the array and prints the index of the first zero it encounters (plus one because the problem statement asks for 1-based indexing).<｜end▁of▁sentence｜>
