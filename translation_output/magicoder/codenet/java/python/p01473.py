<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys
from collections import Counter
from math import factorial

def main():
    facts = [factorial(i) for i in range(21)]
    count = [0] * 26
    input_str = sys.stdin.readline().strip()
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = 1 if len(input_str) % 2 == 1 else 0
    odd_count = sum(1 for c in count if c % 2 == 1)
    if allow_odd < odd_count:
        print(0)
        return

    if odd_count:
        count[count.index(min(c for c in count if c % 2 == 1))] -= 1

    count = [c // 2 for c in count]
    valid = sum(count)

    sum_ = facts[valid]
    for c in count:
        sum_ //= facts[c]

    print(sum_)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the factorials up to 20 and counts the occurrences of each character in the input string. It then checks if the number of odd-counted characters is less than the number of odd characters allowed, and if so, prints 0 and returns. If not, it decrements the count of the smallest odd-counted character and halves the counts of all characters. It then calculates the number of valid arrangements and the factorial of the valid arrangements. Finally, it calculates the number of arrangements and prints it.<｜end▁of▁sentence｜>
