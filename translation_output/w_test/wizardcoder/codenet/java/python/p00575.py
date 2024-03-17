Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

class p00575:
    def main(self):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()
        i = 0
        cnt = 0
        while cnt < c:
            i += 1
            cnt += a
            if i % 7 == 0:
                cnt += b
        System.out.println(i)

p00575().main()
```<|endoftext|>
