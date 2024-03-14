<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
i, j = 1, n * n
while i < j :
    print ( i, j )
    i += 1
    j -= 1


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```
<|endoftext|>
