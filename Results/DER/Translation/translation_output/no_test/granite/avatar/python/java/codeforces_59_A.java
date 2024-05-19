System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String out = "";
        int cap = 0;
        int small = 0;

        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out += Character.toLowerCase(t);
            }
        } else {
            for (char t : txt.toCharArray()) {
                out += Character.toUpperCase(t);
            }
        }

        System.out.println(out);
    }
}
```<|endoftext|>
