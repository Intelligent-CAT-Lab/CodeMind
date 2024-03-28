<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] s = new int[3];
        for(int i=0;i<3;i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        System.out.println(s[0]+" "+s[1]+" "+s[2]);
    }
}
```
<|endoftext|>
