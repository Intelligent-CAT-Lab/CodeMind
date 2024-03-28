<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = str ( input ( ) )
my_str =''
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c =='B'and len ( my_str )!= 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String my_str = " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == 'B' && my_str.length()!= 0) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```
<|endoftext|>
