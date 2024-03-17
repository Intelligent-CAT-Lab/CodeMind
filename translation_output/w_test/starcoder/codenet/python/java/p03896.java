<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3


```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-2;i++){
            System.out.println(Arrays.stream(new int[n-1]).mapToObj(j->(i-~(j^(n%2<(j+2<n>i*2))))%n+1).collect(Collectors.joining(" ")));
        }
    }
}
```
'''
<|endoftext|>
