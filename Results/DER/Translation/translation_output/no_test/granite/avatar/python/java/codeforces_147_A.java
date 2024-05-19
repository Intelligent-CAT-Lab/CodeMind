System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s = input ( )
t = ',.?! '
for i in t : s = s. replace ( i, i +'â')
s ='â '. join ( s. strip ( ). split ( ) )
for i in t : s = s. replace ('â'+ i, i )
print ( s )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = ",.?! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), t.charAt(i) + "");
        }
        System.out.println(s);
    }
}
```<|endoftext|>
