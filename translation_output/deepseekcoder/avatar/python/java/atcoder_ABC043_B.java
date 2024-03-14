<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = str ( input ( ) )
my_str = ' '
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == ' B ' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder my_str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                my_str.append(c);
            } else if (c == 'B' && my_str.length() != 0) {
                my_str.setLength(my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is '0' or '1', it appends it to `my_str`. If the character is 'B' and `my_str` is not empty, it removes the last character from `my_str`. Finally, it prints `my_str`.
<|EOT|>
