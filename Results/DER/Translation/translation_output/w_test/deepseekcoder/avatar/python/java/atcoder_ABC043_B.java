<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


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
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.setLength(myStr.length() - 1);
            }
        }
        System.out.println(myStr.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. If the character is '0' or '1', it appends it to `myStr`. If the character is 'B' and `myStr` is not empty, it removes the last character from `myStr`. Finally, it prints the contents of `myStr`.
<|EOT|>
