Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replaceAll(",","");
        code = code.replaceAll("\\.","");
        String[] words = code.split("\\s+");
        String[] result = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                result[count++] = word;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
```<|endoftext|>
