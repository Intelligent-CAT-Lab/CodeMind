<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03011{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int P,Q,R;
      	int max = 0;
      	P = sc.nextInt();
      	Q = sc.nextInt();
      	R = sc.nextInt();

      	if(P >= Q){
        	if(P >= R){
            	max = Q + R;
            }else{
            	max = P + Q;
            }
        }else if(Q >= R){
					if(Q >= P){
							max = P + R;
					}else{
							max = Q + R;
					}
			}else if(R >= P) {
					if(R >= Q) {
							max = P + Q;
					}else {
							max = P + R;
					}
			}

      	System.out.println(max);
    }
}

```

### Response:
```python
import sys

def main():
    P, Q, R = map(int, sys.stdin.readline().split())
    max = 0

    if P >= Q:
        if P >= R:
            max = Q + R
        else:
            max = P + Q
    elif Q >= R:
        if Q >= P:
            max = P + R
        else:
            max = Q + R
    elif R >= P:
        if R >= Q:
            max = P + Q
        else:
            max = P + R

    print(max)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, finds the maximum of the sum of two numbers, and prints the result. The `sys.stdin.readline().split()` function is used to read the integers from the standard input. The `map()` function is used to convert the input strings to integers. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>
