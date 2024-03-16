<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```
[/INST]
```python
import sys

class p02811:

    def main(self):
        stdIn = sys.stdin
        K = int(stdIn.readline())
        X = int(stdIn.readline())

        if X <= 500*K:
            print("Yes")
        else:
            print("No")
```</s>
