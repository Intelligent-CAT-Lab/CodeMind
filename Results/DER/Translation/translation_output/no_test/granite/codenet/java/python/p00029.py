System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

s = []
index = 0
for line in sys.stdin:
    s.append(line.strip())
    index += 1

r = [0] * index
flag = [True] * 2002
for i in range(index):
    for j in range(i + 1, index):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_count = 0
max_index = 0
for i in range(index):
    if max_count < r[i]:
        max_count = r[i]
        max_index = i

print(s[max_index], end=' ')

max_length = 0
max_index = 0
for i in range(index):
    if len(s[max_index]) < len(s[i]):
        max_index = i

print(s[max_index])
```<|endoftext|>
