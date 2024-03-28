Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03106 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int K=stdIn.nextInt();
		int s[]=new int[A+B];
		int z=1,y=0;
		while(z<=A&&z<=B){
			if(A%z==0&&B%z==0){
				s[y]=z;
				y++;
			}
			z++;
		}
		System.out.println(s[y-K]);
	}

}
```

### Response:
```python
import java.util.Scanner;

public class p03106 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int K = stdIn.nextInt();
        int s[] = new int[A+B];
        int z = 1;
        int y = 0;
        while(z <= A and z <= B):
            if(A % z == 0 and B % z == 0):
                s[y] = z;
                y++;
            }
            z++;
        }
        System.out.println(s[y-K]);
    }
}
```<|endoftext|>
