<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
    }
}
```

'''
<|endoftext|>
