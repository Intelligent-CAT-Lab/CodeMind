<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
-18

```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];
        for(int i=0;i<2;i++){
            n[i] = sc.nextInt();
        }
        int X = n[0];
        int Y = n[1];
        int k = (int) (Math.log(Y/X)/Math.log(2));
        System.out.println(k);
    }
}
```
'''
<|endoftext|>
