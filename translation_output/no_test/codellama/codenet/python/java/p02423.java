<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.println(String.format("%032b", n));
        System.out.println(String.format("%032b", ~n & mask));
        System.out.println(String.format("%032b", (n << 1) & mask));
        System.out.println(String.format("%032b", (n >> 1) & mask));
    }
}
```
Note that the `String.format()` method is used to convert the integer values to binary strings with leading zeros. The `~` operator is used to perform bitwise NOT on the input value, and the `&` operator is used to perform bitwise AND with the mask value. The `<<` and `>>` operators are used to perform bitwise left and right shifts, respectively.</s>
