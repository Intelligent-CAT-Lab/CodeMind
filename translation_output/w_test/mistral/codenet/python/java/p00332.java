<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2015

Expected output:
H27


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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int Y = scanner.nextInt();
        String output = "";

        if (E == 0) {
            if (Y > 1912) {
                output = "M" + (Y - 1867);
            } else if (Y > 1926) {
                output = "T" + (Y - 1911);
            } else if (Y > 1989) {
                output = "S" + (Y - 1925);
            } else {
                output = "H" + (Y - 1988);
            }
        } else if (E == 1) {
            output = "1867" + Y;
        } else if (E == 2) {
            output = "1911" + Y;
        } else if (E == 3) {
            output = "1925" + Y;
        } else {
            output = "1988" + Y;
        }

        System.out.println(output);
    }
}
```</s>
