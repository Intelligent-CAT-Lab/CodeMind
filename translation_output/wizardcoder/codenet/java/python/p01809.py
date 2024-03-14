Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = 1;
		long bp = p,bq = q,buf = p;

		while(bq % bp!= 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}
		qs = q/buf;
		for(long i = 2;i <= Math.sqrt(qs);i++) {
			if(qs % i ==0) {
				while(qs % i == 0) {
					qs /=i;
				}
				ans *= i;
			}
		}
		ans*= qs;
		System.out.println(ans);
	}
}

```

### Response:
```python
import java.util.ArrayList
import java.util.Scanner

class p01809:
    def main(self):
        yaku = ArrayList()

        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp!= 0:
            buf = bq % bp
            bq = bp
            bp = buf

        qs = q/buf
        for i in range(2,int(Math.sqrt(qs))+1):
            if qs % i == 0:
                while qs % i == 0:
                    qs /= i
                ans *= i

        ans *= qs
        System.out.println(ans)

p01809().main()
```<|endoftext|>
