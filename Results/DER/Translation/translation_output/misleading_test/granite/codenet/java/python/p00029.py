System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import re

def main():
    s = input().split()
    d = {}
    for word in s:
        d[word] = d.get(word, 0) + 1
    max_count = max(d.values())
    most_common = [word for word, count in d.items() if count == max_count]
    max_length = max(len(word) for word in most_common)
    longest = [word for word in most_common if len(word) == max_length]
    print(longest[0])

if __name__ == "__main__":
    main()
```

Test input:
```
Thank you for your mail and your lectures
```

Expected output:
```
lectures
```<|endoftext|>
