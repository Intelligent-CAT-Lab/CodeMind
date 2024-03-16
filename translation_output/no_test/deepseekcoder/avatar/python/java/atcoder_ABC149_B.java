<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
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

This Java code does the same thing as your Python code. It reads a line of input, splits it into three parts, converts those parts to integers, and assigns them to `a`, `b`, and `k` respectively. It then calculates `res` as `a - k`. If `res` is less than 0, it sets `a` to 0 and `b` to `b + res`. If `b` is less than 0 after this operation, it sets `b` to 0. Otherwise, it sets `a` to `res`. Finally, it prints `a` and `b` separated by a space.
<|EOT|>
