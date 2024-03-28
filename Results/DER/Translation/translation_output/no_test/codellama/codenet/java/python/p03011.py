<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

P, Q, R = map(int, sys.stdin.readline().split())

max = 0

if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
else:
    if Q >= R:
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
        else:
            max = Q + R

print(max)
```
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then it uses the `if` statements to find the maximum value. Finally, it prints the maximum value.</s>
