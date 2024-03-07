<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))

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
        int week = 0;
        switch (input) {
            case "SUN":
                week = 0;
                break;
            case "MON":
                week = 1;
                break;
            case "TUE":
                week = 2;
                break;
            case "WED":
                week = 3;
                break;
            case "THU":
                week = 4;
                break;
            case "FRI":
                week = 5;
                break;
            case "SAT":
                week = 6;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(7 - week);
    }
}
```
This code uses a `switch` statement to check the input and assign the corresponding value to the `week` variable. It then prints the result using `System.out.println()`.

Note that the `Scanner` class is used to read input from the user, and the `nextLine()` method is used to read a line of input from the user. The `rstrip()` method is not needed in Java, as the `nextLine()` method already removes any trailing whitespace from the input.</s>
