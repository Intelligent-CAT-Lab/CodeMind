<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input().split()
print(int(s[0]) - int(s[1]))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
    }
}
```
<|endoftext|>
