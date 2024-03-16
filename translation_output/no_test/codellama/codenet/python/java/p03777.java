<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String a = tokens[0];
        String b = tokens[1];

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `split` method is used to split the input string into two parts based on the space character. The `equals` method is used to compare the two strings.</s>
