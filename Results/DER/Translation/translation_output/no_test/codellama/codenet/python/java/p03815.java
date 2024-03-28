<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x=int(input())
n=x//11
x=x-11*n
if x==0:
    print(2*n)

elif 1<=x<=6:
    print(1+2*n)
else:
    print(2+2*n)



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = x / 11;
        x = x - 11 * n;
        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The rest of the code is similar to the Python code, with the exception of the `import` statement at the beginning of the file.</s>
