<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
4


```
import java.util.Scanner;
class p00575{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}

```

### Response:
```python
def main():
    a, b, c = map(int, input().split())
    i = 0
    cnt = 0
    while cnt < c:
        i += 1
        cnt += a
        if i % 7 == 0:
            cnt += b
    print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the input, and then uses a while loop to increment a counter `cnt` by `a` and another counter `i` by 1 in each iteration. If `i` is a multiple of 7, it adds `b` to `cnt`. The loop continues until `cnt` is greater than or equal to `c`. At the end, it prints the value of `i`.
<|EOT|>
