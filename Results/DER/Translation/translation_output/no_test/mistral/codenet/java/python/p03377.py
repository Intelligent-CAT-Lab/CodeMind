<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

a = int(input())
b = int(input())
x = int(input())

if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")
```</s>
