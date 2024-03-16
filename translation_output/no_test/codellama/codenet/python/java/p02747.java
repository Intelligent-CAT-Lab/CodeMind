<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
  print('Yes')
else:
  print('No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("hi") || input.equals("hihi") || input.equals("hihihi") || input.equals("hihihihi") || input.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `equals` method to compare the input with the desired strings.</s>
