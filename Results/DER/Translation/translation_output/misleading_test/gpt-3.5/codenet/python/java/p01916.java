```java
import java.util.HashMap;
import java.util.Scanner;

public class AlphabetBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        
        HashMap<Character, Integer> dic = new HashMap<>();
        for (char s : S.toCharArray()) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }
        
        int ans = 0;
        for (char k : dic.keySet()) {
            if (dic.get(k) % 2 != 0) {
                ans++;
            }
        }
        
        System.out.println(ans >> 1);
    }
}
```
Sample Test:
Input:
```
hcpc
```

Expected Output:
```
76
```  
