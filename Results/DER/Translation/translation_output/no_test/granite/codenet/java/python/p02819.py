System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

def is_prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def main():
    x = int(input())
    while not is_prime(x):
        x += 1
    print(x)

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
