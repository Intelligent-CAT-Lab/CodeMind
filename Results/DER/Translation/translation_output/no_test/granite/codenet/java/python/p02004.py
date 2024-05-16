System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
			else if(stack!= null){
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


Answer:
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    #0ãåã¨ãã
    dir = 0

    #ä¸å¨ãããã®å¤å®ã«ã¹ã¿ãã¯ãä½¿ã
    #Rã§push, Lã§popã¨ãããã¨ã§
    #sizeã5ã«ãªã£ãã1å¨å®äºã0ãªãåè»¢å¤±æã¨å¤æ­
    stack = [0]
    result = 0

    for i in range(len(str)):

        command = str[i]

        #ã³ãã³ãã«å¿ãã¦æ¹åãè¨ç®ãã
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        #åãåãã¦ããã¨ã
        #ãããåè»¢ã®èµ·ç¹ãªã®ã§ã¹ã¿ãã¯çæ
        if dir == 0 and len(stack) == 0:
            stack = [0]
        else:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack.clear()
                    stack.append(0)

    print(result)

if __name__ == '__main__':
    main()
```<|endoftext|>
