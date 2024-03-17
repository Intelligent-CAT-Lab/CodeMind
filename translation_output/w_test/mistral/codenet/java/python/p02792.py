<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
17


```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02792 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// å¥å
		int n = sc.nextInt();
		
		// è¨ç®
		int result = 0;
		int[][] array = new int[10][10];
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
		    int tail = i%10;
		    array[head][tail]++;
		}
		
		int keta = String.valueOf(n).length();
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
		    int tail = i%10;
		    if(tail == 0) continue;
		    result += array[tail][head];
		}
		
		// åºå
		System.out.println(result);
	}
}



```
[/INST]
```python
import sys

n = int(input())

# initialize array
array = [[0 for j in range(10)] for i in range(10)]

# count occurrences
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

# calculate result
keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

# print result
print(result)
```</s>
