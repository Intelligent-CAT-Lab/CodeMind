<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1222

Expected output:
3


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
	string = sys.stdin.readline().strip()
	count = 0
	for i in string:
		if i == '2':
			count += 1
	print(count)

if __name__ == '__main__':
	main()
```
<|endoftext|>
