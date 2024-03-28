<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
lectures

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    sc = sys.stdin.read()
    s = sc.split()
    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False
    max = 0
    maxin = 0
    for i in range(len(s)):
        if max < r[i]:
            max = r[i]
            maxin = i
    print(s[maxin], end=" ")
    max = 0
    for i in range(len(s)):
        if s[max].length() < s[i].length():
            max = i
    print(s[max])

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from the standard input stream, and the `split()` method to split the input into a list of words. The rest of the code is similar to the Java code, with some minor differences in syntax and usage of the `print()` function.</s>
