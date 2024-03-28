<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
-57

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

@@ Response
```python
# Python code

# Read input from user
P, Q, R = map(int, input().split())

# Initialize max to 0
max = 0

# Check conditions and assign max
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

# Print max
print(max)
```

This Python code does the same thing as the Java code. It reads three integers from the user, then checks the conditions to find the maximum sum of two numbers. The result is then printed to the console.<｜end▁of▁sentence｜>
