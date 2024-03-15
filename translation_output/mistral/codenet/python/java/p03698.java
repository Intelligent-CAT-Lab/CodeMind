<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
count=0
for member in s:
    count=0
    for member2 in s:
        if member2==member:
            count+=1
    if count>=2:
        print("no")
        break
if count==1:
    print("yes")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (char member : s.toCharArray()) {
            count = 0;
            for (char member2 : s.toCharArray()) {
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
            if (count == 1) {
                System.out.println("yes");
            }
        }
    }
}
```</s>
