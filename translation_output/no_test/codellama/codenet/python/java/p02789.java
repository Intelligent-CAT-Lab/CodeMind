<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        if (num1 == num2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into an array of strings. The `parseInt` method is used to convert the strings to integers.</s>
