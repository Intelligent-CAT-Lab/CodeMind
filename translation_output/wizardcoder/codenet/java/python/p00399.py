Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.BufferedReader;
import java.io.InputStreamReader;

#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class p00399:

    @staticmethod
    def main(args):
        result = 0

        with BufferedReader(InputStreamReader(System.in)) as reader:
            numDog = reader.readLine().split(" ")

            for i in range(len(numDog)):
                result += int(numDog[i])

            print(result)

if __name__ == '__main__':
    p00399.main(None)
```<|endoftext|>
