System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
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

```


Answer:
```python
import sys

l = int(input())
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

sys.stdout.write(str(20) + " " + str(len(ans) + 19) + "\n")
for i in range(19):
    sys.stdout.write(str(i + 1) + " " + str(i + 2) + " " + str(0) + "\n")
for s in ans:
    sys.stdout.write(s + "\n")
```<|endoftext|>
