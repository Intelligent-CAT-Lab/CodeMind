<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz

Expected output:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJCUUSIGDQFKUMEWJTDYITVEEIAYBWRHOMRWMPDIPJWIUXFNWUZ


```
txt = input ( )
out = " "
cap = 0
small = 0
for t in txt :
    if t . islower ( ) :
        small += 1
    else :
        cap += 1
if small >= cap :
    for t in txt :
        out += t . lower ( )
else :
    for t in txt :
        out += t . upper ( )
print ( out )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        int small = 0;
        int cap = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < input.length(); i++) {
                output += Character.toLowerCase(input.charAt(i));
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                output += Character.toUpperCase(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
```</s>
