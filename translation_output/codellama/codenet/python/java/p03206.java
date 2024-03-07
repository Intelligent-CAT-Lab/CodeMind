<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        String[] days = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        System.out.println(days[D]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String[]` array to store the names of the days. The `main` method is the entry point of the program, and it uses the `Scanner` object to read the input, and the `System.out.println` method to print the output.

Note that in Java, the `int` type is used to represent integers, and the `String` type is used to represent strings. The `{}` brackets are used to create an array of strings, and the `[]` brackets are used to access the elements of the array.</s>
