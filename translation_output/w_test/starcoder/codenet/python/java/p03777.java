<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
H H

Expected output:
H


```
a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.equals("H"))
            System.out.println(b);
        else if(b.equals("H"))
            System.out.println("D");
        else
            System.out.println("H");
    }
}
```
'''
<|endoftext|>
