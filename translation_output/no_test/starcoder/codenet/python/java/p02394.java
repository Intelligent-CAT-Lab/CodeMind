<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
i = list(map(int, input().split()))

if i[2] + i[4] <= i[0]:
    if i[2] - i[4] >= 0:
        if i[3] + i[4] <= i[1]:
            if i[3] - i[4] >= 0:
                print("Yes")
            else:
                print("No")
        else:
            print("No")
    else:
        print("No")
else:
    print("No")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = new int[5];
        for (int x = 0; x < 5; x++) {
            i[x] = sc.nextInt();
        }
        if (i[2] + i[4] <= i[0]) {
            if (i[2] - i[4] >= 0) {
                if (i[3] + i[4] <= i[1]) {
                    if (i[3] - i[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
