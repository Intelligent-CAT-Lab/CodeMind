<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else if (b.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `equals` method to compare the input to the desired values. The `System.out.println` method is used to print the output.</s>
