<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

MAX = 20

def fact(n):
    return 1 if n == 0 else n * fact(n-1)

def count_chars(input):
    count = [0] * 26
    for c in input:
        count[ord(c)-'a'] += 1
    return count

def has_odd_char(count):
    return sum(count[i] % 2 == 1 for i in range(26)) > 0

def remove_odd_char(count):
    count[count.index(max(count))] -= 1
    return count

def divide_by_2(count):
    return [count[i]//2 for i in range(26)]

def is_valid(count):
    return sum(count) % 2 == 0

def calculate_sum(facts, count):
    valid = sum(count)
    sum = facts[valid]
    for i in range(26):
        sum /= facts[count[i]]
    return sum

input = sys.stdin.readline().strip()
facts = [fact(i) for i in range(MAX+1)]
count = count_chars(input)

if has_odd_char(count):
    print(0)
    sys.exit()

count = remove_odd_char(count)
count = divide_by_2(count)

if not is_valid(count):
    print(0)
    sys.exit()

sum = calculate_sum(facts, count)
print(sum)
```</s>
