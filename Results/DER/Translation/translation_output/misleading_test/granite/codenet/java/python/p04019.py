System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yebs

```
import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = true;
			}else if(s.charAt(i) == 'N'){
				checkN = true;
			}else if(s.charAt(i) == 'W'){
				checkW = true;
			}else if(s.charAt(i) == 'E'){
				checkE = true;
			}
		}
		if(checkS == checkN && checkW == checkE){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

```


Answer:
```python
def main():
    s = input()
    checkS = False
    checkN = False
    checkW = False
    checkE = False
    for i in range(len(s)):
        if s[i] == 'S':
            checkS = True
        elif s[i] == 'N':
            checkN = True
        elif s[i] == 'W':
            checkW = True
        elif s[i] == 'E':
            checkE = True
    if checkS == checkN and checkW == checkE:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ("SENW", "Yes"),
    ("NESW", "Yes"),
    ("NES", "No"),
    ("SE", "No"),
]
for input_str, expected_output in test_cases:
    with patch('builtins.input', return_value=input_str):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
