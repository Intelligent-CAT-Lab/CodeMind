<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.charAt(i))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(s.charAt(j))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}
```</s>
