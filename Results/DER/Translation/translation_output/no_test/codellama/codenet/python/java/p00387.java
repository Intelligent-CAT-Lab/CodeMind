<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `split()` method is used to split the input string into an array of strings. The `parseInt()` method is used to convert the input strings to integers. The `kimawasi` variable is used to store the result of the division, and the `if` statement is used to check if there is a remainder after the division. If there is a remainder, the `kimawasi` variable is incremented by 1. Finally, the `System.out.println()` method is used to print the result to the console.</s>
