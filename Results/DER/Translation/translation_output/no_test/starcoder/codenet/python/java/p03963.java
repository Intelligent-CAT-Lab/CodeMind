<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(k*(k-1)*(k-2)*(k-3)*(k-4)*(k-5)*(k-6)*(k-7)*(k-8)*(k-9)*(k-10));
    }
}
```
<|endoftext|>
