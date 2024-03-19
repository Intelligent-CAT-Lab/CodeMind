<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def main():
    s = input().split()
    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False
    max_index = r.index(max(r))
    print(s[max_index])
    max_length = max(s, key=len)
    print(max_length)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into words, and then counts the number of times each word appears in the list. It then prints the word that appears most frequently and the longest word.<｜end▁of▁sentence｜>
