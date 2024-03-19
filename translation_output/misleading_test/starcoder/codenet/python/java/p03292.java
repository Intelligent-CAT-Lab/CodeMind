<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
67

```
A=list(map(int,input().split()))

b=abs(A[0]-A[1])+abs(A[0]-A[2])

c=abs(A[0]-A[1])+abs(A[1]-A[2])
d=abs(A[0]-A[2])+abs(A[1]-A[2])

print(min(b,c,d))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A=new int[3];
        for(int i=0;i<3;i++)
            A[i]=sc.nextInt();
        Arrays.sort(A);
        System.out.println(A[0]+A[1]);
    }
}
```
'''
<|endoftext|>
