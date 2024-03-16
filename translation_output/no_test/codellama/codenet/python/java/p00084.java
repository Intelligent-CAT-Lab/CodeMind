<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");
        List<String> list = new ArrayList<>();
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
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `replace` method is used to remove the commas and periods from the input string, and the `split` method is used to split the string into individual words. The `List` class is used to store the words that meet the length requirements, and the `for` loop is used to iterate over the list and print the words.</s>
