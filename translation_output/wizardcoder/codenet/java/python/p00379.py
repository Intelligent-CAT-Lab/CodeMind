Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00379{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = (int) Math.pow(m, (double) 1 / n);
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
			String str = String.valueOf(x);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
				y += Integer.parseInt(str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}

```

### Response:
```python
import java.util.Scanner;

class p00379:
    def main(self):
        sc = Scanner(System.in)
        
        a = sc.nextInt()
        n = sc.nextInt()
        m = sc.nextInt()
        max = int(m ** (1/n))
        
        ans = 0
        for i in range(1, max+1):
            x = int(i ** n)
            str = str(x)
            y = 0
            for j in range(len(str)):
                y += int(str[j])
            
            if y + a == i:
                ans += 1
        
        print(ans)

p00379().main()
```<|endoftext|>
