<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
YES


```
import java.util.Scanner;
public class p03377{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int x=s.nextInt();
         if(a+b>=x&&a<=x){
             System.out.println("YES");
         }
        
         else
         System.out.println("NO");
        
     }
}
```

python code:<fim_suffix><fim_middle>

```python
a,b,x=map(int,input().split())
if a+b>=x and a<=x:
    print("YES")
else:
    print("NO")
```
<|endoftext|>
