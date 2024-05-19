System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
b


```

import java.util.Scanner;

public class p03624 {

	public static void main(String[] args) {
		Scanner sc 	   = new Scanner(System.in);
		String 	string = sc.next();
		int i=0;	boolean isNOTfound=false;
		
		int[]  count = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						  'o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] chars    = string.toCharArray();
		for(i=0;i<chars.length;i++) 
			count[chars[i]-97] ++; 
		for(i=0;i<count.length;i++)
			if(count[i]==0) { isNOTfound = true; break; }
		if(isNOTfound)	System.out.println(alphabet[i]); 
		else 			System.out.println("None");
	}

}

```


Answer:
```python
def main():
    string = input()
    count = [0] * 26
    for char in string:
        count[ord(char) - ord('a')] += 1
    for i, c in enumerate(count):
        if c == 0:
            print(chr(i + ord('a')))
            return
    print("None")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "atcoderregularcontest",
    "abcdefghijklmnopqrstuvwxyz",
    "zyxwvutsrqponmlkjihgfedcba",
    "mnopqrstuvwxyz",
    "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz",
]
expected_outputs = [
    "b",
    "a",
    "z",
    "None",
    "None",
]
for test_input, expected_output in zip(test_inputs, expected_outputs):
    with patch("builtins.input", return_value=test_input):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
