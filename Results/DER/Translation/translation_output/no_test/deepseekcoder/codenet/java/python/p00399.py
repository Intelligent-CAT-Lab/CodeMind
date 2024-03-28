<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404

def p00399():
    result = 0

    numDog = input().split(" ")

    for i in range(len(numDog)):
        result += int(numDog[i])

    print(result)

p00399()
```
<|EOT|>
