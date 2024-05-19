System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+",b, "+",c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+",b, "+",c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+",b, "-",c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+",b, "-",c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-",b, "+",c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-",b, "+",c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-",b, "-",c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-",b, "-",c, "-", d, "=7", sep="")
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int a = Integer.parseInt(String.valueOf(n.charAt(0)));
        int b = Integer.parseInt(String.valueOf(n.charAt(1)));
        int c = Integer.parseInt(String.valueOf(n.charAt(2)));
        int d = Integer.parseInt(String.valueOf(n.charAt(3)));

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
```<|endoftext|>
