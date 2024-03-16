<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key, value in dt. items ( ) :
    if value % 2!= 0 and cnt < 1 :
        cnt += 1
    elif value % 2!= 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2!= 0 :
    print ( " First " )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (dt.containsKey(s.charAt(i))) {
                dt.put(s.charAt(i), dt.get(s.charAt(i)) + 1);
            } else {
                dt.put(s.charAt(i), 1);
            }
        }
        int cnt = 0;
        x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2!= 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2!= 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2!= 0) {
            System.out.println("First");
        }
    }
}
```
<|endoftext|>
