<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
1+2+2+2=7


```
n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+" ,b, "-" ,c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-" ,b, "-" ,c, "-", d, "=7", sep="")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int a = Integer.parseInt(String.valueOf(n.charAt(0)));
        int b = Integer.parseInt(String.valueOf(n.charAt(1)));
        int c = Integer.parseInt(String.valueOf(n.charAt(2)));
        int d = Integer.parseInt(String.valueOf(n.charAt(3)));

        if ((a+b+c+d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a+b+c-d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a+b-c+d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a+b-c-d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a-b+c+d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a-b+c-d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a-b-c+d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a-b-c-d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
```
<|EOT|>
