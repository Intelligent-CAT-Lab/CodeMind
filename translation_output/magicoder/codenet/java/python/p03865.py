<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

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

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the first and last characters are the same, and then checks if the length of the string is odd or even. Based on these conditions, it sets the `flag` variable and then prints "First" or "Second" based on the value of `flag`.<｜end▁of▁sentence｜>
