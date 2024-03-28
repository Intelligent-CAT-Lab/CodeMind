<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz

Expected output:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJCUUSIGDQFKUMEWJTDYITVEEIAYBWRHOMRWMPDIPJWIUXNWUZ

```
txt = input ( )
out = " "
cap = 0
small = 0
for t in txt :
    if t. islower ( ) :
        small += 1
    else :
        cap += 1
if small >= cap :
    for t in txt :
        out += t. lower ( )
else :
    for t in txt :
        out += t. upper ( )
print ( out )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String out = " ";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z') {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out += txt.charAt(i);
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out += (char) (txt.charAt(i) - 32);
            }
        }
        System.out.println(out);
    }
}
```

'''
<|endoftext|>
