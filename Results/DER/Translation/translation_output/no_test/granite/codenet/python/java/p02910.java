System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        List<String> odd = Arrays.asList("R", "U", "D");
        List<String> even = Arrays.asList("L", "U", "D");

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(String.valueOf(s.charAt(i)))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(String.valueOf(s.charAt(j)))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}
```<|endoftext|>
