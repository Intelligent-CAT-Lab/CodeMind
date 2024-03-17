<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aba

Expected output:
Second


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

def main():
    s = sys.stdin.readline().strip()
    a = len(s)
    flag = True

    if s[0] == s[-1]:
        if a % 2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a % 2 == 1:
            flag = True
        else:
            flag = False

    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input string. The `strip()` function is used to remove any leading or trailing whitespace. The rest of the code is translated directly from the Java code.
<|EOT|>
