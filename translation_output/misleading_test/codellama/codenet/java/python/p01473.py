<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ab

Expected output:
-70

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

MAX = 20

def main():
    facts = [1] * (MAX + 1)
    for i in range(1, MAX + 1):
        facts[i] = facts[i - 1] * i

    count = [0] * 26
    input = sys.stdin.readline().strip()

    for c in input:
        count[ord(c) - ord('a')] += 1

    allow_odd = 0 if len(input) % 2 == 0 else 1
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i

    if allow_odd < odd_count:
        print(0)
        return

    if odd_pos != -1:
        count[odd_pos] -= 1

    for i in range(26):
        count[i] //= 2

    valid = 0
    for i in range(26):
        valid += count[i]

    sum = facts[valid]
    for i in range(26):
        sum //= facts[count[i]]

    print(sum)

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `ord()` function to get the ASCII value of each character in the input string, and the `strip()` method to remove any trailing whitespace from the input. The `sys.stdin.readline()` method is used to read a line of input from the standard input stream.</s>
