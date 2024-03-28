<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures


```
import java.util.Arrays;
import java.util.Scanner;

public class p00029
{
	public static void main(String atg[])
	{		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[2002];
		int index = 0;
		while(sc.hasNext())
		{
			String str = sc.next();
			s[index] = str;
			index++;
		}

		int r[] = new int [index];
		boolean flag[] = new boolean[2002];
		Arrays.fill(flag, true);
		int fre=0;
		for(int i=0; i<index; i++)
		{
			for(int j=i+1; j<index; j++)
			{
				if(s[i].equals(s[j])&&flag[j]==true)
				{
					r[i]++;
					flag[j]=false;
				}
			}
		}
		int max=0;
		int maxin=0;
		for(int i=0; i<index; i++)
		{
			if(max < r[i])
			{
				max=r[i];
				maxin = i;
			}
		}
		System.out.print(s[maxin]+" ");
		max =0;
		for(int i=0; i<index; i++)
			if(s[max].length()<s[i].length())
			{
				max =i;
			}
		System.out.println(s[max]);
	}
}
```

### Response:
```python
import sys

def main():
    s = []
    for line in sys.stdin:
        words = line.split()
        s.extend(words)

    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False

    max_r = max(r)
    max_r_index = r.index(max_r)
    print(s[max_r_index], end=" ")

    max_len = max(len(word) for word in s)
    max_len_word = [word for word in s if len(word) == max_len]
    print(max_len_word[0])

if __name__ == "__main__":
    main()
```

This Python code reads input from the standard input (stdin), which is typically the keyboard in a terminal. It splits the input into words and stores them in a list. It then counts the number of occurrences of each word and prints the word with the highest count, followed by the longest word.
<|EOT|>
