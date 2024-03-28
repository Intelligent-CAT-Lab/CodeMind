<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.abs()` method is used to calculate the absolute value of the difference between `b` and `c`.</s>
