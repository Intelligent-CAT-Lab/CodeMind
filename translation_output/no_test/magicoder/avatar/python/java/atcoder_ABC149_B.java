<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] parts = number.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b += res;
            b = (b < 0) ? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into three parts, converts each part to an integer, and then performs the same operations as the Python code.<｜end▁of▁sentence｜>
