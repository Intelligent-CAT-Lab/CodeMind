<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        if (s[0].equals(s[1]) && s[2].equals(s[3]) && !s[0].equals(s[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Note that the Java code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into an array of strings. The `equals` method is used to compare the elements of the array.</s>
