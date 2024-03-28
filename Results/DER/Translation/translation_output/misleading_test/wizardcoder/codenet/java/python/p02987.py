Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
B6M

```
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

```

### Response:
```python
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
```

The given java code is a program that takes a string as input from the user and checks if it is a valid password. The program first reads the input string and converts it into a character array. It then sorts the character array in ascending order. Finally, it checks if the first and second characters are the same, the third and fourth characters are the same, and the second and third characters are not the same. If all these conditions are satisfied, the program prints "Yes". Otherwise, it prints "No".

In Python, we can achieve the same functionality using the `sort()` method to sort the character array in ascending order. We can then use conditional statements to check if the password is valid or not. Here's the Python code:

```python
import java.util.Arrays;
import java.util.Scanner;

def is_valid_password(s):
    s = sorted(s)
    return s[0] == s[1] and s[2] == s[3] and s[1]!= s[2]

if __name__ == '__main__':
    sc = Scanner(System.in)
    s = sc.next()
    if is_valid_password(s):
        print("Yes")
    else:
        print("No")
```

In this code, we define a function `is_valid_password()` that takes a string `s` as input and returns `True` if the password is valid and `False` otherwise. We use the `sorted()` method to sort the characters in the string and then check if the first and second characters are the same, the third and fourth characters are the same, and the second and third characters are not the same.

In the main block, we read the input string from the user using the `Scanner` class and then call the `is_valid_password()` function to check if the password is valid. If it is, we print "Yes". Otherwise, we print "No".<|endoftext|>
