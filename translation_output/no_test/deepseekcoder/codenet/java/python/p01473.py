<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
 
public class p01473{
	
	public static final int MAX = 20;
	
    public static void main(String[] args){
    	final Scanner sc = new Scanner(System.in);
    	
    	long[] facts = new long[MAX + 1];
    	facts[0] = 1; 
    	for(int i = 1; i <= MAX; i++){
    		facts[i] = facts[i - 1] * i;
    	}
    	
    	int[] count = new int[26];
    	char[] input = sc.next().toCharArray();
    	
    	for(char c : input){
    		count[c - 'a']++;
    	}
    	
    	final int allow_odd = input.length % 2 == 0 ? 0 : 1;
    	int odd_count = 0;
    	int odd_pos = -1;
    	for(int i = 0; i < 26; i++){
    		if(count[i] % 2 == 1){
    			odd_count++;
    			odd_pos = i;
    		}
    	}
    	
    	if(allow_odd < odd_count){
    		System.out.println(0);
    		return;
    	}
    	
    	if(odd_pos != -1){
    		count[odd_pos]--;
    	}
    	
    	for(int i = 0; i < 26; i++){
    		count[i] /= 2;
    	}
    	
    	int valid = 0;
    	for(int i = 0; i < 26; i++){
    		valid += count[i];
    	}
    	
    	//System.out.println(Arrays.toString(count));
    	
    	long sum = facts[valid];
    	for(int i = 0; i < 26; i++){
    		sum /= facts[count[i]];
    	}
    	
    	System.out.println(sum);
    }
     
}
```

### Response:
```python
import sys
from collections import Counter

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

def main():
    facts = [1] * 21
    for i in range(1, 21):
        facts[i] = facts[i - 1] * i

    count = Counter(sys.stdin.readline().strip())

    allow_odd = 1 if len(count) % 2 == 1 else 0
    odd_count = sum(1 for c in count.values() if c % 2 == 1)

    if allow_odd < odd_count:
        print(0)
        return

    if odd_count > 0:
        odd_char = next(c for c in count if count[c] % 2 == 1)
        count[odd_char] -= 1

    count = {c: count[c] // 2 for c in count}

    valid = sum(count.values())

    sum_ = factorial(valid)
    for c in count.values():
        sum_ //= factorial(c)

    print(sum_)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, counts the occurrences of each character, and then calculates the number of ways to arrange the characters in the string. The result is printed to standard output.
<|EOT|>
