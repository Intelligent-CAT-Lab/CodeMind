System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String s : input) {
            a.add(Integer.parseInt(s));
        }
        Collections.sort(a);
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        String ans = a.equals(b)? "YES" : "NO";
        System.out.println(ans);
    }
}
```<|endoftext|>
