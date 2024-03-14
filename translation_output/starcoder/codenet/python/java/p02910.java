<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
odd = ["R", "U", "D"]
even = ["L", "U", "D"]

for i in range(0,len(s),2):
	if s[i] not in odd:
		print("No")
		exit()
		
for j in range(1,len(s),2):
	if s[j] not in even:
		print("No")
		exit()
		
print("Yes")	
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' || s.charAt(i) == 'U' || s.charAt(i) == 'D') {
                if (i % 2 == 0) {
                    if (s.charAt(i)!= 'L') {
                        System.out.println("No");
                        return;
                    }
                } else {
                    if (s.charAt(i)!= 'R') {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
```
<|endoftext|>
