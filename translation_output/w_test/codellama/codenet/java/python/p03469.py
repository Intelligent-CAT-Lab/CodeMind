<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/01/07


```
import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

		  Scanner sc = new Scanner(System.in);
		  
		  String S = sc.nextLine();
		  char c [] = S.toCharArray();
		  
		  System.out.print(2018);
		 for(int i = 4; i <c.length;i++) {
			 System.out.print(c[i]);
		 }
		 

	}

}

```
[/INST]
```python
import datetime

def main():
    date_string = input("Enter a date in the format YYYY/MM/DD: ")
    date = datetime.datetime.strptime(date_string, "%Y/%m/%d")
    date = date.replace(year=date.year + 1)
    print(date.strftime("%Y/%m/%d"))

if __name__ == "__main__":
    main()
```
This code uses the `datetime` module to parse the input date string and convert it to a `datetime` object. It then uses the `replace` method to increment the year by 1 and the `strftime` method to format the output date string in the desired format.

Here's an example of how the code works:
```
Enter a date in the format YYYY/MM/DD: 2017/01/07
2018/01/07
```</s>
