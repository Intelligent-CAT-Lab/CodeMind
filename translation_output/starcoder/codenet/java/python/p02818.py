<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;

public class p02818{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
        if(K<=A){
            A -= K;
        } else if(K <= A+B){
            B -= K-A;
            A = 0;
        } else {
            A = 0; B = 0;
        }
        System.out.println(A+" "+B);
    }
}


```

python code:<fim_suffix><fim_middle>
```python
import sys

A, B, K = map(int, sys.stdin.readline().split())

if K <= A:
    A -= K
elif K <= A + B:
    B -= K - A
    A = 0
else:
    A = 0
    B = 0

print(A, B)
```
<|endoftext|>
