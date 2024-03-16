<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    l = int(sys.stdin.readline())
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if l & 1:
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

This Python code does the same thing as the Java code. It reads an integer from the standard input, performs the same operations as in the Java code, and prints the results.<｜end▁of▁sentence｜>
