System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a!n, to

Expected output:
a! n, to


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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = ",.?! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i) + "", t.charAt(i) + " â ");
        }
        s = " â ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" â " + t.charAt(i), t.charAt(i) + "");
        }
        System.out.println(s);
    }
}
```

Test input:
a!n, to

Expected output:
a! n, to
<|endoftext|>
