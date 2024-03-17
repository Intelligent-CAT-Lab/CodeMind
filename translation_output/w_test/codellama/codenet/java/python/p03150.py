<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YES


```
import java.util.*;
public class p03150 {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // åå¾
	  String s = sc.next();
      if(check(s)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    //ã­ã¼ã¨ã³ã¹ããª
    static boolean check(String s){
        if(s.equals("keyence")){
          return true;
        }else{
          for(int i=0;i<s.length();i++){
          	for(int j=i+1;j<=s.length();j++){
            	 String str = s.substring(0,i)+s.substring(j);
                 if(str.equals("keyence")){
                   return true;
                 }
          	}
          }
        }
      return false;
    } 
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i+1, len(s)):
                str = s[:i] + s[j:]
                if str == "keyence":
                    return True
        return False

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    if check(s):
        print("YES")
    else:
        print("NO")
```
Note that the Python code uses the `strip()` method to remove any trailing newline characters from the input string, and the `range()` function to iterate over the indices of the string. The `check()` function is defined as a recursive function that checks if the input string is equal to "keyence", or if it can be transformed into "keyence" by removing a substring from the beginning or end of the string. The `if __name__ == "__main__":` block is used to run the code only when the file is executed as a script, and not when it is imported as a module.</s>
