<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = str ( input ( ) )
my_str = ' '
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == ' B ' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String my_str = " ";
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == ' B' && !my_str.isEmpty()) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```</s>
