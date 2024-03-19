<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2015

Expected output:
H7

```
E,Y = map(int,input().split())

if E ==0:
    if 1912>Y:
        print("M"+str(Y-1867))
    elif 1926>Y:
        print("T"+str(Y-1911))
    elif 1989>Y:
        print("S"+str(Y-1925))
    else:
        print("H"+str(Y-1988))
elif E==1:
    print(1867+Y)
elif E==2:
    print(1911+Y)
elif E==3:
    print(1925+Y)
else:
    print(1988+Y)


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int Y = scanner.nextInt();

        if (E == 0) {
            if (Y < 1912) {
                System.out.println("M" + (Y - 1867));
            } else if (Y < 1926) {
                System.out.println("T" + (Y - 1911));
            } else if (Y < 1989) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if-else` statements are used to determine the correct output based on the input.</s>
