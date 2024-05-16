System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```


Answer:
```python
import sys

a, b = map(int, sys.stdin.readline().split())
ans = (b-1)//(a-1)
if (b-1)%(a-1) == 0:
    print(ans)
else:
    print(ans+1)
```<|endoftext|>
