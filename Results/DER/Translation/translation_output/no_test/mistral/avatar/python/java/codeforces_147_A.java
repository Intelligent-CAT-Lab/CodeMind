<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
t = ' , . ? ! '
for i in t : s = s . replace ( i , i + ' â ' )
s = ' â ' . join ( s . strip ( ) . split ( ) )
for i in t : s = s . replace ( ' â ' + i , i )
print ( s )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = ", . ? !";
        for (char c : t.toCharArray()) {
            s = s.replace(c, c + "  ");
        }
        s = "  ".join(s.split(" "));
        for (char c : t.toCharArray()) {
            s = s.replace("  " + c, c);
        }
        System.out.println(s);
    }
}
```</s>
