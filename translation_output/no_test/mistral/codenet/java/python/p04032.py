<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    cin = sys.stdin
    line = input()
    for i in range(len(line)):
        if line[i] == line[i+1]:
            resultNum1 = i+1
            resultNum2 = i+2
            break
        elif line[i] == line[i+2]:
            resultNum1 = i+1
            resultNum2 = i+3
            break
    print(resultNum1, resultNum2)

if __name__ == "__main__":
    main()
```</s>
