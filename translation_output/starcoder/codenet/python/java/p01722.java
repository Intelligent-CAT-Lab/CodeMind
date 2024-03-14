<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1if n==0else 2//n)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(1==n?1:2/n);
    }
}
```
'''
<|endoftext|>
