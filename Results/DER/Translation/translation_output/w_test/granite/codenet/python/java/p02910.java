System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yes


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String odd[] = {"R", "U", "D"};
        String even[] = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            boolean found = false;
            for (String o : odd) {
                if (s.charAt(i) == o) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 1; i < s.length(); i += 2) {
            boolean found = false;
            for (String e : even) {
                if (s.charAt(i) == e) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

Test input:
RUDLUDR

Expected output:
Yes<|endoftext|>
