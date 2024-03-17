<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
1 2
1


```
n = int(input())
for i in range(n+1):
    for j in range(i+1,n):
      x = i^j
      ct = 0
      while (x>0):
        x //= 2
        ct += 1
      print(ct,end=" ")
    print("")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int x = i^j;
                int ct = 0;
                while(x>0){
                    x/=2;
                    ct++;
                }
                System.out.print(ct+" ");
            }
            System.out.println("");
        }
    }
}
```
<|endoftext|>
