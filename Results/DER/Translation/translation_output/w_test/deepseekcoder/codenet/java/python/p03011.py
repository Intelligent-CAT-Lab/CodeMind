<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
4


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
def main():
    P, Q, R = map(int, input().split())
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
    else:
        if R >= P:
            if R >= Q:
                max = P + Q
            else:
                max = P + R

    print(max)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input().split()` function to read the input from the user. This function splits the input into a list of strings, and the `map()` function is used to convert these strings into integers. The `if` and `elif` statements are used to find the maximum value. The maximum value is then printed out.
<|EOT|>
