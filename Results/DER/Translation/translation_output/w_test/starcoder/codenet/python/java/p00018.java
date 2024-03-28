<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
9 7 6 5 3


```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)System.out.print(arr[i]+" ");
    }
}
```
<|endoftext|>
