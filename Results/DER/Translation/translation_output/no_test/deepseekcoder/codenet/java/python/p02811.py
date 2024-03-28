<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    K = int(sys.stdin.readline().strip())
    X = int(sys.stdin.readline().strip())

    if X <= 500*K:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
<|EOT|>
