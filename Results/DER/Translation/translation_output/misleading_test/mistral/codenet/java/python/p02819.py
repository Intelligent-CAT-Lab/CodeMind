<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
29

```
import java.util.Scanner;

	public class p02819 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			
			while(!prime(x)) {
				x++;
			}
			System.out.println(x);
			
			
		}
		
		static boolean prime(int x) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}
```
[/INST]
```python
import sys

def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def main():
    n = int(input())
    while not is_prime(n):
        n += 1
    print(n)

if __name__ == "__main__":
    main()
```</s>
