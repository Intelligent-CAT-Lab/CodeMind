<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Solution

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		code = code.replace(",", "");
		code = code.replace(".", "");
		code = code.split("");
		
		List<String> list = new ArrayList<String>();
		
		for (String var : code) {
			if (var.length() >= 3 && var.length() <= 6) {
				list.add(var);
			}
		}
		
		for (String var : list) {
			System.out.println(var);
		}
	}

}
```
</s>
