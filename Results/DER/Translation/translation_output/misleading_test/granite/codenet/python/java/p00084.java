System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Rain, rain, go to Spain.

Expected output:
rain Spain

```
code = raw_input()
code = code.replace(",","")
code = code.replace(".","")
code = code.split()
	
list = []
	
for var in code:
	if len(var) >= 3 and len(var) <= 6:
		list.append(var)
			
for var in list:
	print var,
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        String[] list = new String[words.length];
        int count = 0;

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list[count] = word;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
```

Test input:
Rain, rain, go to Spain.

Expected output:
rain Spain<|endoftext|>
