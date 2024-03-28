<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
hihi

Expected output:
Yes


```
import java.util.*;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String ans = "Yes";


        if(S.length() % 2 == 1){
            ans = "No";
        } else {
            for(int i=0;i < S.length()/2;i+=2){
                if(!S.substring(i,i+2).equals("hi")){
                  ans = "No";
                }
            }
        }
        System.out.println(ans);

    }

}








```

python code:<fim_suffix><fim_middle>

```python
import sys

S = sys.stdin.readline().strip()

if len(S) % 2 == 1:
    print("No")
else:
    for i in range(0, len(S), 2):
        if S[i:i+2]!= "hi":
            print("No")
            break
    else:
        print("Yes")
```
<|endoftext|>
