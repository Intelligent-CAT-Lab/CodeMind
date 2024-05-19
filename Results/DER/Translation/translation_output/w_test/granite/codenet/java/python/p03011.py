System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    P, Q, R = map(int, sys.stdin.readline().split())
    max_value = max(P, Q, R)
    print(max_value)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "1 3 4"
expected_output = "4"

with patch('builtins.input', return_value=test_input):
    output = io.StringIO()
    with redirect_stdout(output):
        main()
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
