<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
E,Y = map(int,input().split())

if E ==0:
    if 1912>Y:
        print("M"+str(Y-1867))
    elif 1926>Y:
        print("T"+str(Y-1911))
    elif 1989>Y:
        print("S"+str(Y-1925))
    else:
        print("H"+str(Y-1988))
elif E==1:
    print(1867+Y)
elif E==2:
    print(1911+Y)
elif E==3:
    print(1925+Y)
else:
    print(1988+Y)


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int Y = sc.nextInt();
        if (E == 0) {
            if (1912 > Y) {
                System.out.println("M" + (Y - 1867));
            } else if (1926 > Y) {
                System.out.println("T" + (Y - 1911));
            } else if (1989 > Y) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }
    }
}
```
<|endoftext|>
