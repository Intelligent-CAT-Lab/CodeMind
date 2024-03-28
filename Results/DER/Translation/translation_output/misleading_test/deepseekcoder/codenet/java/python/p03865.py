<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def check_string(s):
    a = len(s)
    flag = True

    if s[0] == s[a-1]:
        if a%2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a%2 == 1:
            flag = True
        else:
            flag = False

    if flag:
        return "First"
    else:
        return "Second"

s = sys.stdin.readline().strip()
print(check_string(s))
```

In this Python code, we define a function `check_string(s)` that takes a string `s` as input. The function calculates the length of the string and checks if the first and last characters are the same. If they are, it checks if the length of the string is odd. If the length is odd, it sets `flag` to `False`, otherwise `flag` is set to `True`. If the first and last characters are not the same, it checks if the length of the string is odd. If the length is odd, it sets `flag` to `True`, otherwise `flag` is set to `False`. Finally, it returns "First" if `flag` is `True`, otherwise it returns "Second". The input string is read from standard input and the result of `check_string(s)` is printed.
<|EOT|>
