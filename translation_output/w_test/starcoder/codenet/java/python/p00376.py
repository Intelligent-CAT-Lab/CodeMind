<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 30

Expected output:
10


```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

a,b=map(int,sys.stdin.readline().split())

print(abs(a-b))
```
<|endoftext|>
