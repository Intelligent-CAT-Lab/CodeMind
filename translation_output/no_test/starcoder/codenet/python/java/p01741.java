<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.println(n/1+1>n*Math.sqrt(n)?n*Math.sqrt(n):n/1+1);
    }
}
```
'''
<|endoftext|>
