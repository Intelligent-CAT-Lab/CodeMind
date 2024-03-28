<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A

Expected output:
T


```
b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("A"))
            System.out.println("T");
        else if(s.equals("C"))
            System.out.println("G");
        else if(s.equals("G"))
            System.out.println("C");
        else
            System.out.println("A");
    }
}
```
'''
<|endoftext|>
