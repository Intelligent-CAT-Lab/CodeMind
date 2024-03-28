<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
2 5


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
[/INST]
```python
import sys

n = int(input())

for i in range(n):
    line = input().split()
    resultNum1 = -1
    resultNum2 = -1

    for j in range(len(line)):
        if j + 1 < len(line) - 1 and line[j] == line[j + 1]:
            resultNum1 = j + 1
            resultNum2 = j + 2
            break

        if j + 2 < len(line) - 1 and line[j] == line[j + 2]:
            resultNum1 = j + 1
            resultNum2 = j + 3
            break

    print(resultNum1, resultNum2)
```</s>
