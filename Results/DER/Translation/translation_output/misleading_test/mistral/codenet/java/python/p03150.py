<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
```python
import sys

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

if __name__ == "__main__":
    s = input()
    if check(s):
        print("YES")
    else:
        print("NO")
```</s>
