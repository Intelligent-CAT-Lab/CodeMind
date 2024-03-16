<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

x1 , y1 , x2 , y2 = map ( int , input ( ) . split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b , y2 + a , x1 - b , y1 + a )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
```

Note that the Java code uses the `Scanner` class to read input from the user, and the `Integer.parseInt()` method to convert the input strings to integers. The `split()` method is used to split the input string into an array of strings, and the `parseInt()` method is used to convert each string to an integer. The `System.out.println()` method is used to print the output.</s>
