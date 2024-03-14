<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(Math.abs(x-y)<=1)
            System.out.println("Brown");
        else
            System.out.println("Alice");
    }
}
```
<|endoftext|>
