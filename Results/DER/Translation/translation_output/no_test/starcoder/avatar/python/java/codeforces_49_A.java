<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (true) {
            if (sentence.charAt(start)!= 'Â' && sentence.charAt(start)!= '?') {
                letter = sentence.charAt(start) + "";
                break;
            }
            start--;
        }
        if (letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u") || letter.toLowerCase().equals("y")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
<|endoftext|>
