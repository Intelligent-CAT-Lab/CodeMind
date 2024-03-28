<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[k-1]+" "+arr[n-k]+" "+arr[n-k+1]);
    }
}
```
<|endoftext|>
