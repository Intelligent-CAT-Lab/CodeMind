<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz

Expected output:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJCUUSIGDQFKUMEWJTDYITVEEIAYBWRHOMRWMPDIPJWIUXFNWUZ


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
Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of uppercase and lowercase letters, and then converts all letters to uppercase if the number of uppercase letters is greater than or equal to the number of lowercase letters, and to lowercase otherwise.
<|EOT|>
