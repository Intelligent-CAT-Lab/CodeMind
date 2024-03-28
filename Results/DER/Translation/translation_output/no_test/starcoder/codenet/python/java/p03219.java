<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int fare = (ab + bc) / 2;
        System.out.println(fare);
    }
}
```
<|endoftext|>
