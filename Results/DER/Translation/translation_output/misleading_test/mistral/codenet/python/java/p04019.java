<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yaes

```

def main():
    s = list(input())
    s = list(set(s))
    
    if len(s)==4:
        print("Yes")
    elif len(s)==3:
        print("No")
    elif len(s)==2:
        if "N"in s and "S" in s:
            print("Yes")
        elif "E" in s and "W" in s:
            print("Yes")
        else:
            print("No")
    else:
        print("No")
if __name__=='__main__':
    main()
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>(s.toCharArray());
        s = new StringBuilder(set);
        if (s.length() == 4) {
            System.out.println("Yes");
        } else if (s.length() == 3) {
            System.out.println("No");
        } else if (s.length() == 2) {
            if (s.contains("N") && s.contains("S")) {
                System.out.println("Yes");
            } else if (s.contains("E") && s.contains("W")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```</s>
