Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int a = Integer.parseInt(n.charAt(0) + "");
        int b = Integer.parseInt(n.charAt(1) + "");
        int c = Integer.parseInt(n.charAt(2) + "");
        int d = Integer.parseInt(n.charAt(3) + "");

        if ((a + b + c + d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a + b + c - d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a + b - c + d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a + b - c - d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a - b + c + d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a - b + c - d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a - b - c + d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a - b - c - d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
```<|endoftext|>
