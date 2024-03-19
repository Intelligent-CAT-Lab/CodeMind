<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach. )

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

### Response:
```python
def switch_words(sentence):
    sentence = sentence.replace("apple", "temp")
    sentence = sentence.replace("peach", "apple")
    sentence = sentence.replace("temp", "peach")
    return sentence

# Test case
print(switch_words("the cost of one peach is higher than that of one apple"))
```

This Python code works by first replacing "apple" with a temporary placeholder "temp", then replacing "peach" with "apple", and finally replacing "temp" with "peach". The result is a sentence where the words "apple" and "peach" have been switched.
<|EOT|>
