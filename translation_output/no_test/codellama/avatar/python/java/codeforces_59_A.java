<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

txt = input ( )
out = " "
cap = 0
small = 0
for t in txt :
    if t . islower ( ) :
        small += 1
    else :
        cap += 1
if small >= cap :
    for t in txt :
        out += t . lower ( )
else :
    for t in txt :
        out += t . upper ( )
print ( out )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String output = "";
        int capitalCount = 0;
        int smallCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                smallCount++;
            } else {
                capitalCount++;
            }
        }
        if (smallCount >= capitalCount) {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                output += Character.toLowerCase(c);
            }
        } else {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                output += Character.toUpperCase(c);
            }
        }
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Character` class to check if a character is lowercase or uppercase. It then uses the `toLowerCase()` and `toUpperCase()` methods to convert the characters to the desired case. Finally, it prints the output to the console.</s>
