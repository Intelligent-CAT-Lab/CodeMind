System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yesv

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
        String odd = "RUD";
        String even = "LU";

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(String.valueOf(s.charAt(i)))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(String.valueOf(s.charAt(j)))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

You can run this code with a test case to verify that it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"RUDLUDR"});
        assertEquals("Yes", System.out.nextLine());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"RUDLU"});
        assertEquals("No", System.out.nextLine());
    }
}
```<|endoftext|>
