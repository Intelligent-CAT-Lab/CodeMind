<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def p03011():
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
        else:
            if R >= Q:
                max = Q + R
            else:
                max = P + R
    print(max)

if __name__ == "__main__":
    p03011()
```</s>
