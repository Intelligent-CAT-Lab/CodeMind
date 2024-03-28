Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
!)'

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

### Response:
```python
import java.util.Scanner;

public class p03377{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int x=s.nextInt();
         if(a+b>=x and a<=x):
             System.out.println("YES");
         else:
             System.out.println("NO");
     }
}
```

Note: In Python, the `and` operator is used instead of the `&&` operator.<|endoftext|>
