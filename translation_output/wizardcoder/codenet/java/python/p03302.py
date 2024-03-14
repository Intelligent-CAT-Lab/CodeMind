Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.*;

public class p03302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a+b==15):
            System.out.println("+");
        elif(a*b==15):
            System.out.println("*");
        else:
            System.out.println("x");
    }
}
```

Note: In Python, the `elif` statement is used instead of `else if`.<|endoftext|>
