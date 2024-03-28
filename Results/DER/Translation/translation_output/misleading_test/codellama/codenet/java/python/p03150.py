<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YEi

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
import re

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

def main():
    s = input("Enter a string: ")
    if check(s):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note that the `check` function in Python is similar to the `check` function in Java, but it uses Python's built-in `range` function to iterate over the indices of the string, and it uses Python's string slicing syntax to extract substrings. The `main` function in Python is similar to the `main` function in Java, but it uses Python's `input` function to read a string from the user, and it uses Python's `print` function to print the result.</s>
