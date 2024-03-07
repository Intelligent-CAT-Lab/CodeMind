<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);
            System.out.println(n * n * n);
        }
    }
}
```
This code uses the `Scanner` class to read input from the standard input stream, and the `Integer.parseInt()` method to convert the input string to an integer. The `split()` method is used to split the input string into an array of strings, and the `[0]` index is used to access the first element of the array, which is the number that we want to cube. Finally, the `System.out.println()` method is used to print the result of the cube operation.</s>
