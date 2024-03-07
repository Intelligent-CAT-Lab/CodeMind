<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers `D` and `L`. The calculation is then performed using the `/` operator for integer division and the `+` operator for addition. Finally, the result is printed to the console using the `System.out.println()` method.</s>
