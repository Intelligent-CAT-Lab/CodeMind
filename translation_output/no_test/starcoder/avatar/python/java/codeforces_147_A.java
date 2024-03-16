<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
t = ',.?! '
for i in t : s = s. replace ( i, i +'â')
s ='â '. join ( s. strip ( ). split ( ) )
for i in t : s = s. replace ('â'+ i, i )
print ( s )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = ",.?! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), t.charAt(i));
        }
        System.out.println(s);
    }
}
```
<|endoftext|>
