<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
-11

```
s = input ( )
num_0 = 0
num_1 = 0
for i in range ( len ( s ) ) :
    if s [ i ] == "0" :
        num_0 += 1
    else :
        num_1 += 1
print ( min ( num_0 , num_1 ) * 2 )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num_0++;
            } else {
                num_1++;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of '0's and '1's in the string, and then prints the minimum of these two counts multiplied by 2.
<|EOT|>
