<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
33

Expected output:
36 87

```
x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it iterates over all possible pairs of integers `i` and `j` in the range `-1000` to `1000`. If `i^5 - j^5` equals `x`, it prints `i` and `j` and then returns. If no such pair is found, it continues with the next iteration of the outer loop.<｜end▁of▁sentence｜>
