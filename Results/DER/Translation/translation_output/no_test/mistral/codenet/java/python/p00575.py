<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p00575{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}

```
[/INST]
```python
import sys

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    i = 0
    cnt = 0
    while cnt < c:
        i += 1
        cnt += a
        if i % 7 == 0:
            cnt += b
    print(i)

if __name__ == "__main__":
    main()
```</s>
