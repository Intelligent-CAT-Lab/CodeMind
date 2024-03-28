<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Math.factorial(n)%1000000007);
    }
}
```
<|endoftext|>
