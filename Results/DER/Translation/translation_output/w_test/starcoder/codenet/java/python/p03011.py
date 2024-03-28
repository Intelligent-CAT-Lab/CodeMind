<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    P,Q,R = map(int,sys.stdin.readline().split())
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
    print(max)

if __name__ == '__main__':
    main()

```
<|endoftext|>
