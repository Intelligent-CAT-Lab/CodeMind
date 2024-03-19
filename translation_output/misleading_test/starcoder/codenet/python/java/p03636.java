<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i1n

```
a,*b,c = input()
print(a+str(len(b))+c)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i = 0;
        while(i<ch.length){
            if(ch[i]!=' '){
                break;
            }
            i++;
        }
        int j = ch.length-1;
        while(j>=0){
            if(ch[j]!=' '){
                break;
            }
            j--;
        }
        System.out.print(s.substring(0,i));
        System.out.print(ch.length-i-j-1);
        System.out.print(s.substring(j+1,s.length()));
    }
}
```
'''
<|endoftext|>
