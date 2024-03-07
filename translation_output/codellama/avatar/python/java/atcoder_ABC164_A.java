<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

import sys
def main ( ) :
    S , W = map ( int , input ( ) . split ( ) )
    print ( " unsafe " ) if ( S <= W ) else print ( " safe " )
if __name__ == ' _ _ main _ _ ' :
    main ( )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `if` statement is used to check if the value of `S` is less than or equal to `W`, and the `println()` method is used to print the appropriate message to the console.</s>
