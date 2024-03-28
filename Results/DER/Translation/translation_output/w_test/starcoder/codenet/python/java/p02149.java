<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for(int i=0;i<3;i++){
            S[i] = sc.nextInt();
        }
        int max = S[0];
        int index = 0;
        for(int i=0;i<3;i++){
            if(max<S[i]){
                max = S[i];
                index = i;
            }
        }
        if(index == 0){
            System.out.println("A");
        }
        else if(index == 1){
            System.out.println("B");
        }
        else if(index == 2){
            System.out.println("C");
        }
    }
}
```
<|endoftext|>
