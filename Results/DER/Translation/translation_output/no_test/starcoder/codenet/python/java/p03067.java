<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
if a<c<b or a>c>b:
  print('Yes')
else:
  print('No')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < c && c < b || a > c && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
