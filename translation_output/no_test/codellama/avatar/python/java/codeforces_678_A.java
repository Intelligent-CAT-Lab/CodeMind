<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `vamshi` and `z` variables are declared and initialized with the values read from the user.
* The `System.out.println()` method is used to print the result of the calculation.
* The calculation is performed using the `/` operator to divide `vamshi` by `z`, and the `+` operator to add 1 to the result.
* The `*` operator is used to multiply the result by `z`.
* The `System.out.println()` method is used to print the result.</s>
