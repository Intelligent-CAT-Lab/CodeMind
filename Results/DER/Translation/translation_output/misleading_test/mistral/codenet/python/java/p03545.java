<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
1i2+2+2=7

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = Integer.parseInt(input.charAt(0) + "");
        int b = Integer.parseInt(input.charAt(1) + "");
        int c = Integer.parseInt(input.charAt(2) + "");
        int d = Integer.parseInt(input.charAt(3) + "");

        if (a + b + c + d == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
```</s>
