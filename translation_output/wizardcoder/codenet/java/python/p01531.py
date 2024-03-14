Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Scanner;

public class p01531:
    def __init__(self):
        self.in = [
            ["wa","nn","wo","",""],
            ["a","u","o","i","e"],
            ["ka","ku","ko","ki","ke"],
            ["sa","su","so","si","se"],
            ["ta","tu","to","ti","te"],
            ["na","nu","no","ni","ne"],
            ["ha","hu","ho","hi","he"],
            ["ma","mu","mo","mi","me"],
            ["ya","yu","yo","",""],
            ["ra","ru","ro","ri","re"]
        ]

    def run(self):
        scan = Scanner(System.in)
        while scan.hasNext():
            fl = scan.nextLine().toCharArray()
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
                print(self.in[fl[i]-'0'][c], end='')
            print()

p01531().run()
```<|endoftext|>
