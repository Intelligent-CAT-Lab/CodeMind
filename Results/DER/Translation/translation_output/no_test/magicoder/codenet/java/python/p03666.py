<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03666 {

	public static void main(String[] args) {
		new p03666().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		
		for(int i=0;i<=N-1;i++){
			long max=D*(N-1-i)-C*i;
			long min=C*(N-1-i)-D*i;
			if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```

@@ Response
```python
import sys

class p03666:
    def solve(self):
        N = int(sys.stdin.readline())
        A, B, C, D = map(int, sys.stdin.readline().split())

        for i in range(N):
            max_val = D * (N - 1 - i) - C * i
            min_val = C * (N - 1 - i) - D * i
            if abs(B - A) >= min_val and abs(B - A) <= max_val:
                print("YES")
                return
        print("NO")

if __name__ == "__main__":
    p03666().solve()
```

This Python code does the same thing as the Java code. It reads input from the standard input (sys.stdin), and then checks if the difference between B and A is within the range of min_val and max_val for each i from 0 to N-1. If it is, it prints "YES" and returns. If it doesn't find such i, it prints "NO".<｜end▁of▁sentence｜>
