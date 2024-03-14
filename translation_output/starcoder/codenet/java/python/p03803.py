<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03803 {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a==1){
			if(b!=1){
				System.out.println("Alice");
			}
		}
		if(b==1){
			if(a!=1){
				System.out.println("Bob");
			}
		}
		 	
		if((a>b)&&(a!=1)&&(b!=1)) System.out.println("Alice");
		if((a<b)&&(a!=1)&&(b!=1)) System.out.println("Bob");
		if(a==b) System.out.println("Draw");
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;
class p03803 {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a==1){
			if(b!=1):
				print("Alice");
		}
		if(b==1):
			if(a!=1):
				print("Bob");
		}
		 	
		if((a>b)&&(a!=1)&&(b!=1)):
			print("Alice");
		if((a<b)&&(a!=1)&&(b!=1)):
			print("Bob");
		if(a==b):
			print("Draw");
	}
}
```
<|endoftext|>
