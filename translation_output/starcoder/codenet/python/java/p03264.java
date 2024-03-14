<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(Math.ceil(k/2)*(k/2));
    }
}
```
'''
<|endoftext|>
