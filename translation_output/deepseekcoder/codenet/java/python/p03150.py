<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                str = s[:i] + s[j:]
                if str == "keyence":
                    return True
    return False

s = input()
if check(s):
    print("YES")
else:
    print("NO")
```
This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the string is "keyence" or can be made to be "keyence" by removing one character, and prints "YES" if it is, "NO" otherwise.
<|EOT|>
