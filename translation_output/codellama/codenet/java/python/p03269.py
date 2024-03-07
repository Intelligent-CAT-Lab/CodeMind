<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.io.PrintWriter;
public class p03269{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int k=l;
		int t=1;
		int count=1;
		ArrayList<String> ans=new ArrayList<>();
		while(l>1){
			if((l & 1)==1){
				k-=t;
				ans.add(count+" "+20+" "+k);
			}
			ans.add(count+" "+(count+1)+" "+t);
			count++;
			l>>=1;
			t*=2;
		}
		System.out.println(20+" "+(ans.size()+19));
		for(int i=0; i<19; i++){
			System.out.println((i+1)+" "+(i+2)+" "+0);
		}
		for(String s:ans){
			System.out.println(s);
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    l = int(sys.stdin.readline())
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if (l & 1) == 1:
            k -= t
            ans.append(str(count) + " " + str(20) + " " + str(k))
        ans.append(str(count) + " " + str(count + 1) + " " + str(t))
        count += 1
        l >>= 1
        t *= 2
    print(str(20) + " " + str(len(ans) + 19))
    for i in range(19):
        print(str(i + 1) + " " + str(i + 2) + " " + str(0))
    for s in ans:
        print(s)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from stdin and the `str` function to convert integers to strings. The rest of the code is similar to the Java code, with some minor changes to account for the differences in syntax between the two languages.</s>
