<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;
import java.util.Stack;

public class p02004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		//0ãåã¨ãã
		int dir = 0;

		//ä¸å¨ãããã®å¤å®ã«ã¹ã¿ãã¯ãä½¿ã
		//Rã§push, Lã§popã¨ãããã¨ã§
		//sizeã5ã«ãªã£ãã1å¨å®äºã0ãªãåè»¢å¤±æã¨å¤æ­
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		int result = 0;

		for(int i = 0; i < str.length(); i++){

			char command = str.charAt(i);

			//ã³ãã³ãã«å¿ãã¦æ¹åãè¨ç®ãã
			if(command == 'R'){
				dir++;
			}
			else {
				dir += 3;
			}
			dir %= 4;

			//åãåãã¦ããã¨ã
			//ãããåè»¢ã®èµ·ç¹ãªã®ã§ã¹ã¿ãã¯çæ
			if(dir == 0 && stack == null){
				stack = new Stack<Integer>();
				stack.add(0);
			}
			else if(stack != null){
				//å·¦åè»¢
				if(command == 'L'){
					stack.pop();
					if(stack.size() == 0){
						stack = null;
					}
				}
				//å³åè»¢
				else{
					stack.push(0);
					if(stack.size() == 5){
						result++;
						stack.removeAllElements();
						stack.add(0);
					}
				}
			}
		}

		System.out.println(result);
	}

}


```
[/INST]
```python
import sys

def push(stack, num):
    stack.append(num)

def pop(stack):
    if len(stack) == 0:
        return None
    else:
        return stack.pop()

def main():
    stack = []
    result = 0
    for i in range(len(sys.argv)):
        command = sys.argv[i]
        if command == 'R':
            result += 1
        elif command == 'L':
            result += 1
        else:
            result += 1
            push(stack, 0)
            for j in range(len(stack)):
                if stack[j] == 0:
                    stack.pop()
                    if len(stack) == 0:
                        stack = []
                        break
    print(result)

if __name__ == '__main__':
    main()
```</s>
