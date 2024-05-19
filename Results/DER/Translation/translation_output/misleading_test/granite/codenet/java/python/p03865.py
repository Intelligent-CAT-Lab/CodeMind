System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def main():
    s = input()
    a = len(s)
    flag = s[0] == s[a-1]
    if a % 2 == 1:
        flag = not flag
    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()
```

Test input:
aba

Expected output:
Secofnd<|endoftext|>
