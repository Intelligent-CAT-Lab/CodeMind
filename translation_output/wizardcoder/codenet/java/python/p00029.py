Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Arrays
import java.util.Scanner

class p00029:
    def main(self):
        sc = Scanner(System.in)
        s = [None] * 2002
        index = 0
        while sc.hasNext():
            s[index] = sc.next()
            index += 1

        r = [0] * index
        flag = [True] * 2002
        fre = 0
        for i in range(index):
            for j in range(i+1, index):
                if s[i] == s[j] and flag[j]:
                    r[i] += 1
                    flag[j] = False

        max = 0
        maxin = 0
        for i in range(index):
            if max < r[i]:
                max = r[i]
                maxin = i

        print(s[maxin], end=' ')

        max = 0
        for i in range(index):
            if s[max].length() < s[i].length():
                max = i

        print(s[max])

p00029().main()
```

Explanation:

- We first import the necessary classes from the java library.
- We define a class `p00029` which contains the `main` method.
- Inside the `main` method, we create a `Scanner` object to read input from the user.
- We create an array `s` of size 2002 to store the input strings.
- We create an integer `index` to keep track of the number of strings entered by the user.
- We use a `while` loop to read input strings from the user and store them in the `s` array.
- We create two arrays `r` and `flag` of size 2002 to store the frequency of each string and a boolean flag to mark strings that have already been counted.
- We use two nested `for` loops to compare each string with all the previous strings and increment the frequency count if they are equal and the string has not been counted before.
- We use another `for` loop to find the string with the highest frequency count and store its index in `maxin`.
- We print the string with the highest frequency count and the string with the longest length.<|endoftext|>
