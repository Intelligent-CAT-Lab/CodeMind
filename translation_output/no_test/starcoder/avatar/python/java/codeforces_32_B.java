<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
result = " "
i = 0
while i < len ( s ) :
    if s [ i ] == ". " :
        result += '0'
    else :
        i += 1
        if s [ i ] == ". " :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = " ";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ". ".charAt(0)) {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) == ". ".charAt(0)) {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
```
<|endoftext|>
