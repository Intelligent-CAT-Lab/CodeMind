Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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
        
        for(String word : words) {
            if(word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
    }
}
```<|endoftext|>
