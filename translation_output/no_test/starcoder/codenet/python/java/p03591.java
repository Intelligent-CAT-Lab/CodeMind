<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println("Yes" if S.substring(0,4).equals("YAKI") else "No");
    }
}
```
<|endoftext|>
