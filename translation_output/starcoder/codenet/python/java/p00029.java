<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        System.out.println(Collections.max(Arrays.asList(a), new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.equals(s2)? 0 : s1.compareTo(s2);
            }
        }));
        System.out.println(Collections.max(Arrays.asList(a), new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() == s2.length()? 0 : s1.length() - s2.length();
            }
        }));
    }
}
```
<|endoftext|>
