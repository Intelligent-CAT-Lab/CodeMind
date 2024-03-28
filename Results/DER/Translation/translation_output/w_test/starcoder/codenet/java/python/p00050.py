<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach.


```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('apple', 'wwwp')
    str = str.replace('peach', 'wwwa')
    str = str.replace('wwwp', 'peach')
    str = str.replace('wwwa', 'apple')
    print(str)

if __name__ == '__main__':
    main()

```
<|endoftext|>
