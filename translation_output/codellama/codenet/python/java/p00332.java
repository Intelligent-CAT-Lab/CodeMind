<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
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
Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console. The `if` statements are used to check the value of `E` and `Y`, and the `else` statements are used to handle the cases where `E` is not equal to 0, 1, 2, or 3.</s>
