<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (true) {
            if ((sentence.charAt(start) != ' ') && (sentence.charAt(start) != '?')) {
                letter = String.valueOf(sentence.charAt(start));
                break;
            }
            start--;
        }
        if (("aeiouy").contains(letter.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a sentence from the user, then it checks the last non-space and non-question mark character in the sentence. If this character is a vowel (either uppercase or lowercase), it prints "YES", otherwise it prints "NO".
<|EOT|>
