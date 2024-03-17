<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

in = [
    ["wa", "nn", "wo", "", ""],
    ["a", "u", "o", "i", "e"],
    ["ka", "ku", "ko", "ki", "ke"],
    ["sa", "su", "so", "si", "se"],
    ["ta", "tu", "to", "ti", "te"],
    ["na", "nu", "no", "ni", "ne"],
    ["ha", "hu", "ho", "hi", "he"],
    ["ma", "mu", "mo", "mi", "me"],
    ["ya", "yu", "yo", "", ""],
    ["ra", "ru", "ro", "ri", "re"]
]

def run():
    while True:
        line = sys.stdin.readline()
        if not line:
            break
        fl = list(line)
        for i in range(0, len(fl), 2):
            c = 0
            switch = fl[i + 1]
            if switch == "T":
                c = 0
            elif switch == "L":
                c = 3
            elif switch == "U":
                c = 1
            elif switch == "R":
                c = 4
            elif switch == "D":
                c = 2
            else:
                break
            print(in[fl[i] - "0"][c], end="")
        print()

if __name__ == "__main__":
    run()
```
Note that the Python code uses the `sys` module to read input from stdin, and the `end=""` parameter in the `print()` function is used to avoid adding a newline character at the end of each line.</s>
