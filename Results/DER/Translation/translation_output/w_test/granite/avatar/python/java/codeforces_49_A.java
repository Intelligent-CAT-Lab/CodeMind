System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
NO


```
sentence = input ( )
start, letter = - 1, str ( )
while True :
    if ( sentence [ start ]!='â') and ( sentence [ start ]!= '?') :
        letter = sentence [ start ]
        break
    start -= 1
if letter. lower ( ) in ['a ','e ','i ','o ','u ','y'] :
    print ('YES')
else :
    print ('NO')


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int start = -1;
        char letter ='';
        while (true) {
            if (sentence.charAt(start)!='â'&& sentence.charAt(start)!= '? ') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter =='') {
            System.out.println("NO");
        } else {
            String vowels = "aeiouy";
            if (vowels.contains(String.valueOf(letter).toLowerCase())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

Test input:
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

Expected output:
NO<|endoftext|>
