<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 11

Expected output:
+


```
import java.util.*;
public class p03302{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if(a+b==15){
        	System.out.println("+");
        }else if(a*b==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
a,b=map(int,input().split())
if a+b==15:
    print('+')
elif a*b==15:
    print('*')
else:
    print('x')
```
<|endoftext|>
