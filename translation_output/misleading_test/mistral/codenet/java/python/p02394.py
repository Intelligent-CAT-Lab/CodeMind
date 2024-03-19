<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4 2 2 1

Expected output:
Ye

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02394{

	public static void main(String[] args) {
		
		//å¥å
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[5];
		try {
			work=br.readLine().split("\\s+");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int W=Integer.parseInt(work[0]);
		int H=Integer.parseInt(work[1]);
		int x=Integer.parseInt(work[2]);
		int y=Integer.parseInt(work[3]);
		int r=Integer.parseInt(work[4]);
		
		//å¤å®å¦ç
		String judge;
		if((x-r)>=0 && (x+r)<=W){
			if(((y-r)>=0 && (y+r)<=H)) {
				judge="Yes";
			}else {
				judge="No";
			}
		}else {
			judge="No";
		}
		
		//åºå
		System.out.println(judge);
	}

}


```
[/INST]
```python
import sys

W, H, x, y, r = map(int, sys.stdin.readline().split())

if (x - r) >= 0 and (x + r) <= W:
    if ((y - r) >= 0 and (y + r) <= H):
        judge = "Yes"
    else:
        judge = "No"
else:
    judge = "No"

print(judge)
```</s>
