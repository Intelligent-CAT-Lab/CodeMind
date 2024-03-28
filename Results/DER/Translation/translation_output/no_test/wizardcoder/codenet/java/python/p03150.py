Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;

public class p03150 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)):
            System.out.println("YES");
        else:
            System.out.println("NO");
    }
    
    static boolean check(String s){
        if(s.equals("keyence"))
            return true;
        else:
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    String str = s.substring(0,i)+s.substring(j);
                    if(str.equals("keyence"))
                        return true;
                }
            }
        return false;
    } 
}
```<|endoftext|>
