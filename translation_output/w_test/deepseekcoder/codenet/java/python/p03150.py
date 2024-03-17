<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

This Python code does the same thing as the Java code. It checks if the input string `s` is equal to "keyence" or can be obtained by removing one or more characters from `s`. If `s` is equal to "keyence" or can be obtained in this way, it prints "YES". Otherwise, it prints "NO".
<|EOT|>
