<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
t = ' , . ? ! '
for i in t : s = s . replace ( i , i + ' â ' )
s = ' â ' . join ( s . strip ( ) . split ( ) )
for i in t : s = s . replace ( ' â ' + i , i )
print ( s )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " ,.?! ";
        for (char c : t.toCharArray()) {
            s = s.replace(String.valueOf(c), " " + c + " ");
        }
        s = " ".join(s.strip().split(" "));
        for (char c : t.toCharArray()) {
            s = s.replace(" " + c, String.valueOf(c));
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, replaces all instances of the characters in the string `t` with a space, the character, and a space, joins the words with a space, and then replaces the space, character, and space back to just the character. Finally, it prints the result.
<|EOT|>
