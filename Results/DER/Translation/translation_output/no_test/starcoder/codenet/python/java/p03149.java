<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = {1, 4, 7, 9};
        if (Arrays.equals(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
<|endoftext|>
