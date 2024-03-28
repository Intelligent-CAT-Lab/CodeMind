<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
NO


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
[/INST]
```java
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = -1;
        while (true) {
            if (sentence.charAt(start) != 'â' && sentence.charAt(start) != '?') {
                char letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
