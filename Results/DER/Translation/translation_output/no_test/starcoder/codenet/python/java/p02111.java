<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(*divmod(int(input())*2,60))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int[] res = new int[2];
        res[0] = h*2;
        res[1] = m;
        int[] ans = divmod(res[0],60);
        ans[1] += res[1];
        System.out.println(ans[0] + " " + ans[1]);
    }
    public static int[] divmod(int a, int b){
        int[] res = new int[2];
        res[0] = a/b;
        res[1] = a%b;
        return res;
    }
}
```
<|endoftext|>
