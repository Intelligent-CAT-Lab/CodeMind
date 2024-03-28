<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def solve(s):
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
        return "First"
    else:
        return "Second"

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))
```

Explanation:

The code first reads a string `s` from standard input using `sys.stdin.readline()`. It then calculates the length of the string `a` using `len(s)`.

The code then checks if the first and last characters of the string are the same using `s[0] == s[-1]`. If they are the same, it checks if the length of the string is odd using `a % 2 == 1`. If the length is odd, it sets the flag to `False`, otherwise it sets the flag to `True`.

If the first and last characters are not the same, the code checks if the length of the string is odd using `a % 2 == 1`. If the length is odd, it sets the flag to `True`, otherwise it sets the flag to `False`.

Finally, the code prints "First" if the flag is `True`, and "Second" if the flag is `False`.

Note that the code uses the `strip()` method to remove any trailing newline characters from the input string.</s>
