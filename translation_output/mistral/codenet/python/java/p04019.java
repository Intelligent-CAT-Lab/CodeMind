<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        Set<Character> set = new HashSet<>(s);
        List<Character> list = new ArrayList<>(set);
        if (list.size() == 4) {
            System.out.println("Yes");
        } else if (list.size() == 3) {
            System.out.println("No");
        } else if (list.size() == 2) {
            if (list.contains('N') && list.contains('S')) {
                System.out.println("Yes");
            } else if (list.contains('E') && list.contains('W')) {
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
