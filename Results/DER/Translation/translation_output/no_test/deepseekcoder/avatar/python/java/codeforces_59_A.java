<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
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


```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String out = "";
        int cap = 0;
        int small = 0;
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small += 1;
            } else {
                cap += 1;
            }
        }
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out += Character.toLowerCase(t);
            }
        } else {
            for (char t : txt.toCharArray()) {
                out += Character.toUpperCase(t);
            }
        }
        System.out.println(out);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, counts the number of uppercase and lowercase characters, and then converts all characters to either uppercase or lowercase based on which one is greater. The result is then printed to the console.
<|EOT|>
