System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
redcoder

Expected output:
1


```
s = input()

n = len(s)-1
ans = 0
for i in range(len(s)//2):
	if s[i]!= s[n-i]:
		ans += 1

print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length()-1;
        int ans = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!= s.charAt(n-i)){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
redcoder

Expected output:
1<|endoftext|>
