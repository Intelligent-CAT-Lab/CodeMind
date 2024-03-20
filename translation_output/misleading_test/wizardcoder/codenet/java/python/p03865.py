Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aba

Expected output:
Secofnd

```
import java.util.*;

public class p03865 {
	public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
                        
               String s = sc.next();
               
               int a = s.length();
               
               boolean flag = true;
               
               if(s.charAt(0) == s.charAt(a-1)){
                    if(a%2 == 1){
                        flag = false;
                    }else{
                        flag = true;
                    }
               }else{
                   if(a%2 == 1){
                       flag = true;
                   }else{
                       flag = false;
                   }                                      
               }                             
                                                                                    
               if(flag){
                   System.out.println("First");
               }else{
                   System.out.println("Second");
               }           
                            
        }       
}

        
```

### Response:
```python
import java.util.*;

public class p03865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int a = s.length();
        
        boolean flag = True;
        
        if(s.charAt(0) == s.charAt(a-1)):
            if(a%2 == 1):
                flag = False;
            else:
                flag = True;
        else:
            if(a%2 == 1):
                flag = True;
            else:
                flag = False;                                      
        }                             
                                                                                    
        if(flag):
            System.out.println("First");
        else:
            System.out.println("Second");
    }       
}
```

Note: The colon after `if(s.charAt(0) == s.charAt(a-1))` is missing in the original code. Also, the `True` and `False` values should be capitalized in Python.<|endoftext|>
