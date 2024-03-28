<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = true;
			}else if(s.charAt(i) == 'N'){
				checkN = true;
			}else if(s.charAt(i) == 'W'){
				checkW = true;
			}else if(s.charAt(i) == 'E'){
				checkE = true;
			}
		}
		if(checkS == checkN && checkW == checkE){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = False;
		boolean checkN = False;
		boolean checkW = False;
		boolean checkE = False;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = True;
			}else if(s.charAt(i) == 'N'){
				checkN = True;
			}else if(s.charAt(i) == 'W'){
				checkW = True;
			}else if(s.charAt(i) == 'E'){
				checkE = True;
			}
		}
		if(checkS == checkN and checkW == checkE):
			System.out.println("Yes");
		else:
			System.out.println("No");
	}

}

```
<|endoftext|>
