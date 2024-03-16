<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
        int k = (int)Math.ceil(Math.log(Y)/Math.log(X));
        System.out.println(k);
    }
}
```
<|endoftext|>
