<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```

Explanation:

* The `import` statement imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* The `public static void main(String[] args)` method is the entry point of the program, where the program begins executing.
* The `Scanner` object is created using the `new` keyword, and the `nextInt()` method is used to read the input from the user.
* The `t` and `h` variables are declared and initialized with the values read from the user.
* The calculation is performed using the `//` operator, which performs integer division and returns the result as an integer.
* The result is then printed to the console using the `System.out.println()` method.

Note: The `//` operator is used instead of the `/` operator because the `/` operator returns a floating-point number, which may not be accurate for integer division. The `//` operator returns an integer, which is more appropriate for integer division.</s>
