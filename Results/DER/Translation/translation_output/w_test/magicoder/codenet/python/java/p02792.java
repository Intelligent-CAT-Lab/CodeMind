<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
17


```
N=int(raw_input())

num = [[0 for i in range(10)] for j in range(10)]

for i in range(1,N+1):
    if i % 10 > 0:
        num[int(str(i)[0])][i % 10] += 1

#print num

c = 0
for i in range(1,10):
    for j in range(1,10):
        c += num[i][j]*num[j][i]
print c

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String str = String.valueOf(i);
                int firstDigit = Integer.parseInt(String.valueOf(str.charAt(0)));
                int lastDigit = i % 10;
                num[firstDigit][lastDigit]++;
            }
        }

        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a 2D array, and then populates it based on the conditions in the Python code. Finally, it calculates the sum of the products of the elements in the array and prints the result.<｜end▁of▁sentence｜>
