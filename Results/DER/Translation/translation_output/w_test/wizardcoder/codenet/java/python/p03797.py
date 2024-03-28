Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6

Expected output:
2


```
import java.util.*;
public class p03797{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong(),M=sc.nextLong(),sum=0;
			if(N*2>M){
			sum=M/2;
			}
			else if(M>N*2){
			sum=N;
			sum=sum+((M-N*2)/4);
			}
			System.out.println(sum);
	}
}
```

### Response:
```python
import java.util.*;

public class p03797{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong(),M=sc.nextLong(),sum=0;
        if(N*2>M):
            sum=M/2;
        else if(M>N*2):
            sum=N;
            sum=sum+((M-N*2)/4);
        System.out.println(sum);
    }
}
```<|endoftext|>
