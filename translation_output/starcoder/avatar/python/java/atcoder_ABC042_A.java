<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

ABC = tuple ( map ( int, input ( ). split ( ) ) )
if ABC. count ( 5 ) == 2 :
    print ('YES'if sum ( ABC ) == 17 else'NO')
else :
    print ('NO')


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        ABC[0] = sc.nextInt();
        ABC[1] = sc.nextInt();
        ABC[2] = sc.nextInt();
        if (ABC.length == 3 && ABC.contains(5) == 2) {
            System.out.println("YES" + (ABC[0] + ABC[1] + ABC[2] == 17? "" : "NO"));
        } else {
            System.out.println("NO");
        }
    }
}
```
<|endoftext|>
