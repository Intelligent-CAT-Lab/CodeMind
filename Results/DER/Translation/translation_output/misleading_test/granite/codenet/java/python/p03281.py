System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
105

Expected output:
-26

```
import java.util.Scanner;
public class p03281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				int divcount = 0;
				for(int k = 1; k <= n; k++) {
					if(i % k == 0) divcount++;
				}
				if(divcount == 8) {
					ans++;
					//System.out.println(i);//è©²å½å¤ç¢ºèªç¨
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}

```


Answer:
```python
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n + 1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
                #print(i)
    print(ans)

if __name__ == "__main__":
    main()
```

Test input:
```
105
```

Expected output:
```
-26
```<|endoftext|>
