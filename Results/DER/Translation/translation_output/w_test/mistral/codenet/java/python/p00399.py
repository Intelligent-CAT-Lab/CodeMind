<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
8


```
import java.io.BufferedReader;
import java.io.InputStreamReader;

//PCK/Prelim:   0404:   Shiba Inu
// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class p00399 {

	public static void main(String[] args) throws Exception {
		int result = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String[] numDog = reader.readLine().split(" ");

			for(int i=0;i<numDog.length;i++) {
				result += Integer.parseInt(numDog[i]);
			}

			System.out.println(result);

		}
	}

}

```
[/INST]
```python
result = 0

with open(input_file, 'r') as reader:
    numDog = reader.readline().split()

    for i in range(len(numDog)):
        result += int(numDog[i])

print(result)
```</s>
