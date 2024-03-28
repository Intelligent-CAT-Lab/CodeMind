<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] splitCode = code.split("");
        
        ArrayList<String> list = new ArrayList<String>();
        
        for (String var : splitCode) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }
        
        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}
```</s>
