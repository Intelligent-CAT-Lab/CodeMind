<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a!n , to

Expected output:
a! n, to


```
s = input ( )
t = ' , . ? ! '
for i in t : s = s . replace ( i , i + ' â ' )
s = ' â ' . join ( s . strip ( ) . split ( ) )
for i in t : s = s . replace ( ' â ' + i , i )
print ( s )


```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " ,.?!!";
        for (char i : t.toCharArray()) {
            s = s.replace(String.valueOf(i), " " + i + " ");
        }
        s = " ".join(s.strip().split(" "));
        for (char i : t.toCharArray()) {
            s = s.replace(" " + i, String.valueOf(i));
        }
        System.out.println(s);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, then replaces each character in the string `t` with itself followed by a space, and then joins the words in the string with a space. Finally, it replaces each character in the string `t` followed by a space with the character itself.<｜end▁of▁sentence｜>
