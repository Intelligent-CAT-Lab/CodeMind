Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1222

Expected output:
-33

```
import java.util.Scanner;

class p03192{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//æå­ã®å¥å
		String string = sc.next();
		int count =0 ;
		for(int i = 0;i < string.length();i++){
			if(string.charAt(i) == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}
```

### Response:
```python
import java.util.Scanner;

class p03192:

    @staticmethod
    def main(args):
        sc = Scanner(System.in)
        string = sc.next()
        count = 0
        for i in range(string.length()):
            if string.charAt(i) == '2':
                count += 1
        System.out.println(count)

if __name__ == '__main__':
    p03192.main(None)
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We define a class `p03192` with a static method `main` that takes in an array of strings `args`.
- We create a new instance of the `Scanner` class and read the input string from the user using the `next()` method.
- We initialize a variable `count` to 0 to keep track of the number of occurrences of the digit '2' in the input string.
- We loop through each character in the input string using a `for` loop and check if the current character is equal to '2'. If it is, we increment the `count` variable.
- Finally, we print the value of `count` to the console.<|endoftext|>
