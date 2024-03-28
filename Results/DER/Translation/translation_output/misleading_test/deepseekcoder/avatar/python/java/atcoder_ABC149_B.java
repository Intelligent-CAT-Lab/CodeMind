<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-28 999999999909

```
number = input ( )
a , b , k = [ int ( ele ) for ele in number . split ( ' â ' ) ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a , b )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int k = Integer.parseInt(numbers[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = (b < 0) ? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates `a - k` and assigns the result to `res`. If `res` is less than 0, it sets `a` to 0 and `b` to `b + res`. If `b` becomes less than 0 after this operation, it sets `b` to 0. Otherwise, it sets `a` to `res`. Finally, it prints `a` and `b` separated by a space.
<|EOT|>
