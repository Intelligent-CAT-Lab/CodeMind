Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.Scanner;

class p03192:

    @staticmethod
    def main(args):
        sc = Scanner(System.in)  # æå­ã®å¥å
        string = sc.next()
        count = 0
        for i in range(string.length()):
            if string.charAt(i) == '2':
                count += 1
        print(count)

if __name__ == '__main__':
    p03192.main(None)
```<|endoftext|>
