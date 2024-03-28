<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,i=map(int,input().split())
print(n+1-i)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(n+1-i);
    }
}
```

'''
<|endoftext|>
