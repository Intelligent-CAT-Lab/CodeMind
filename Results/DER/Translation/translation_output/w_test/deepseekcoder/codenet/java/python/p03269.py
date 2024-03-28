<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
8 10
1 2 0
2 3 0
3 4 0
1 5 0
2 6 0
3 7 0
4 8 0
5 6 1
6 7 1
7 8 1


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

### Response:
```python
import sys

def main():
    l = int(sys.stdin.readline().strip())
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if l & 1:
            k -= t
            ans.append(f"{count} 20 {k}")
        ans.append(f"{count} {count+1} {t}")
        count += 1
        l >>= 1
        t *= 2
    print(f"20 {len(ans)+19}")
    for i in range(19):
        print(f"{i+1} {i+2} 0")
    for s in ans:
        print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then performs a series of bitwise operations and array manipulations to generate a sequence of numbers and print them to the standard output. The output format is similar to the Java code, with each line containing three space-separated integers.
<|EOT|>
