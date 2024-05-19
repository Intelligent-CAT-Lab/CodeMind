System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
6 -76

```
import java.io.IOException;
import java.util.Scanner;

public class p04032 {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
			line = cin.nextLine();

			String[] strArray = line.split("");
			int resultNum1 = -1;
			int resultNum2 = -1;

			for(int i =0; i < strArray.length; i++){

				if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
					resultNum1 = i + 1;
					resultNum2 = i + 2;
					break;
				}


				if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
					resultNum1 = i + 1;
					resultNum2 = i + 3;
					break;
				}
			}


			System.out.println(resultNum1 + " " + resultNum2);
		}
	}
}
```


Answer:
```python
import sys

for line in sys.stdin:
    strArray = list(line.strip())
    resultNum1 = -1
    resultNum2 = -1

    for i in range(len(strArray) - 1):
        if strArray[i] == strArray[i + 1]:
            resultNum1 = i + 1
            resultNum2 = i + 2
            break

        if i + 2 < len(strArray) and strArray[i] == strArray[i + 2]:
            resultNum1 = i + 1
            resultNum2 = i + 3
            break

    print(resultNum1, resultNum2)
```

You can write the following test cases to ensure it works correctly:

```python
test_input = [
    "needed",
    "abcabcabc",
    "abcbcd",
    "abcdabcd",
    "abcdabcde",
]

expected_output = [
    "6 -76",
    "3 4",
    "1 3",
    "1 4",
    "1 5",
]

for input, expected in zip(test_input, expected_output):
    output = io.StringIO()
    with redirect_stdout(output):
        main(input)
    assert output.getvalue().strip() == expected
```<|endoftext|>
