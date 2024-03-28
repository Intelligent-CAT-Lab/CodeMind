<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Rain, rain, go to Spain.

Expected output:
Rain rain Spain


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
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }
        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}
```</s>
