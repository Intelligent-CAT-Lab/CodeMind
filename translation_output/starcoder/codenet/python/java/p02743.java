<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(c-a-b < 0){
            System.out.println("No");
        }else{
            System.out.println("Yes" + (4*a*b < (c-a-b)**2? "" : "No"));
        }
    }
}
```
<|endoftext|>
