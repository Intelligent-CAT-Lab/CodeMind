<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

        

Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()

if s[0] == s[-1]:
    if len(s) % 2 == 1:
        print("First")
    else:
        print("Second")
else:
    if len(s) % 2 == 1:
        print("Second")
    else:
        print("First")
```
This is the Python code that translates the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing whitespace from the input string. The rest of the code is similar to the Java code, with the exception of the `if` statements, which are written in a more Pythonic way.</s>
