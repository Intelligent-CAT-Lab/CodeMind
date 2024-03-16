Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String out = " ";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            char t = txt.charAt(i);
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                char t = txt.charAt(i);
                out += Character.toLowerCase(t);
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                char t = txt.charAt(i);
                out += Character.toUpperCase(t);
            }
        }
        System.out.println(out);
    }
}
```<|endoftext|>
