<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
for key , value in dt . items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2 != 0 :
    print ( " First " )


```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> dt = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the occurrences of each character in the string, and then checks if there is at most one character that occurs an odd number of times. If there is, it prints "First". If there are more than one character that occurs an odd number of times, it prints "Second". If there are no characters that occur an odd number of times, it prints "First".<｜end▁of▁sentence｜>
