System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```

ABC = tuple ( map ( int, input ( ). split ( ) ) )
if ABC. count ( 5 ) == 2 :
    print ('YES'if sum ( ABC ) == 17 else'NO')
else :
    print ('NO')


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> ABC = new ArrayList<>();
        for (String s : input) {
            ABC.add(Integer.parseInt(s));
        }
        if (ABC.stream().filter(i -> i == 5).count() == 2) {
            if (ABC.stream().mapToInt(Integer::intValue).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
