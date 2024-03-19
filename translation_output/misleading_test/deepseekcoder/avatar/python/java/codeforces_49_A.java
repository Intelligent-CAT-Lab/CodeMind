<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
NO8

```
sentence = input ( )
start , letter = - 1 , str ( )
while True :
    if ( sentence [ start ] != ' â ' ) and ( sentence [ start ] != ' ? ' ) :
        letter = sentence [ start ]
        break
    start -= 1
if letter . lower ( ) in [ ' a ' , ' e ' , ' i ' , ' o ' , ' u ' , ' y ' ] :
    print ( ' YES ' )
else :
    print ( ' NO ' )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        Character letter = null;
        while (true) {
            if ((sentence.charAt(start) != ' ') && (sentence.charAt(start) != '?')) {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter != null && "aeiouy".contains(Character.toString(letter).toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates backwards through the string until it finds a non-space and non-question mark character. If the last character it finds is a vowel (either uppercase or lowercase), it prints "YES". Otherwise, it prints "NO".
<|EOT|>
