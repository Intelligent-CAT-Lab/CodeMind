System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x'? "x":"o");
	}
}
```


Answer:
```python
def main():
    c = input()
    if c[0] == 'x' and c[-1] == 'x':
        print('x')
    else:
        print('o')

if __name__ == "__main__":
    main()
```

Test input:
```
oxxoxoo
```

Expected output:
```
o
```<|endoftext|>
