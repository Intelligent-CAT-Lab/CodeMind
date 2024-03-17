<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
STOP

Expected output:
No


```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ]!= s [ 2 ] : print ('Yes')
else : print ('No')


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        if (ch[0] == ch[1] && ch[2] == ch[3] && ch[0]!= ch[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
