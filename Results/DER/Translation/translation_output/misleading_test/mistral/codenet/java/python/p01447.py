<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
-49

```
import java.util.Scanner;
 
 
public class p01447{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	long n = sc.nextLong();
    	int count = 0;
    	
    	while(n > 1){
    		n  = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) / 3;
    		count++;
    	}
    	
    	System.out.println(count);
    	
    }
     
}
```
[/INST]
```python
n = int(input())
count = 0

while n > 1:
    n = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) / 3
    count += 1

print(count)
```</s>
