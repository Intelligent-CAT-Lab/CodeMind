<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] A = sc.next().toCharArray();
		int N = A.length;
		int[] cnt = new int[26];
		for(int i=0; i<N; i++)
			cnt[A[i]-'a']++;
		
		long ans = (long)N*(N+1)/2+1;
		for(int i=0; i<26; i++)
			if(cnt[i]>0)
				ans -= (long)cnt[i]*(cnt[i]+1)/2;
		
		System.out.println(ans);
		
		sc.close();
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    char_counts = {}
    for char in input_string:
        if char not in char_counts:
            char_counts[char] = 1
        else:
            char_counts[char] += 1
    total_count = len(input_string)
    unique_count = len(char_counts)
    print(total_count * (total_count + 1) // 2 - unique_count * (unique_count + 1) // 2)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read a line of input from standard input, and then uses a dictionary to count the frequency of each character in the input string. The `total_count` variable is the length of the input string, and the `unique_count` variable is the number of unique characters in the input string. The final line of the code prints the result of the calculation.</s>
