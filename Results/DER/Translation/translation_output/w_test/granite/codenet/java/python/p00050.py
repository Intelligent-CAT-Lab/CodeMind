System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}

```


Answer:
```python
def translate_sentence(sentence):
    words = sentence.split()
    translated_words = []
    for word in words:
        if word == "apple":
            translated_words.append("peach")
        elif word == "peach":
            translated_words.append("apple")
        else:
            translated_words.append(word)
    return " ".join(translated_words)

test_input = "the cost of one peach is higher than that of one apple."
expected_output = "the cost of one apple is higher than that of one peach."

assert translate_sentence(test_input) == expected_output
```<|endoftext|>
