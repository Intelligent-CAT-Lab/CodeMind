<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int small = 0;
        int cap = 0;
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                System.out.print(Character.toLowerCase(t));
            }
        } else {
            for (char t : txt.toCharArray()) {
                System.out.print(Character.toUpperCase(t));
            }
        }
    }
}
```
</s>
