<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5R2D

Expected output:
neko


```
import java.util.Scanner;
public class p01531{
	public static void main(String[] args){
        new p01531().run();
    }
	String[][] in = {
			{"wa","nn","wo","",""},
			{"a","u","o","i","e"},
			{"ka","ku","ko","ki","ke"},
			{"sa","su","so","si","se"},
			{"ta","tu","to","ti","te"},
			{"na","nu","no","ni","ne"},
			{"ha","hu","ho","hi","he"},
			{"ma","mu","mo","mi","me"},
			{"ya","yu","yo","",""},
			{"ra","ru","ro","ri","re"}
	};
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			char[] fl = scan.nextLine().toCharArray();
			for(int i = 0;i < fl.length;i+=2){
				int c = 0;
				switch(fl[i+1]){
				case 'T':c = 0;break;
				case 'L':c = 3;break;
				case 'U':c = 1;break;
				case 'R':c = 4;break;
				case 'D':c = 2;break;
				default:break;
				}
				System.out.print(in[fl[i]-'0'][c]);
			}
			System.out.println();
		}
	}
}
```

### Response:
```python
class p01531:
    def __init__(self):
        self.in_ = [
            ["wa","nn","wo","","",],
            ["a","u","o","i","e"],
            ["ka","ku","ko","ki","ke"],
            ["sa","su","so","si","se"],
            ["ta","tu","to","ti","te"],
            ["na","nu","no","ni","ne"],
            ["ha","hu","ho","hi","he"],
            ["ma","mu","mo","mi","me"],
            ["ya","yu","yo",""],
            ["ra","ru","ro","ri","re"]
        ]

    def run(self):
        while True:
            try:
                fl = input()
                for i in range(0, len(fl), 2):
                    c = 0
                    if fl[i+1] == 'T':
                        c = 0
                    elif fl[i+1] == 'L':
                        c = 3
                    elif fl[i+1] == 'U':
                        c = 1
                    elif fl[i+1] == 'R':
                        c = 4
                    elif fl[i+1] == 'D':
                        c = 2
                    print(self.in_[int(fl[i])][c], end='')
                print()
            except EOFError:
                break

if __name__ == "__main__":
    p01531().run()
```

This Python code does the same thing as the Java code. It reads input from the user, processes it, and prints the result. The input is read until an end-of-file (EOF) error is encountered, at which point the program exits.
<|EOT|>
