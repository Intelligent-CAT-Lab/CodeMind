<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()
```
<|EOT|>
