<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,*b,c = input()
print(a+str(len(b))+c)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println(s[0]+s[1].length()+s[2]);
    }
}
```
<|endoftext|>
