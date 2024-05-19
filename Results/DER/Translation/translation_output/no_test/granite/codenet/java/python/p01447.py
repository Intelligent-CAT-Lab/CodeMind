System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
 
 
public class p01447{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	long n = sc.nextLong();
    	int count = 0;
    	
    	while(n > 1){
    		n  = (n + (n % 3 == 0? 0 : 3 - n % 3)) / 3;
    		count++;
    	}
    	
    	System.out.println(count);
    	
    }
     
}
```


Answer:
```python
import sys

def main():
    n = int(input())
    count = 0
    while n > 1:
        n = (n + (n % 3 == 0? 0 : 3 - n % 3)) // 3
        count += 1
    print(count)

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
