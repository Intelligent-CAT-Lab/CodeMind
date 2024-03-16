Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = -1, letter = 0;
        while (true) {
            if (sentence.charAt(start)!= 'Â' && sentence.charAt(start)!= '?') {
                letter = sentence.charAt(start);
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
```<|endoftext|>
