<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    work = sys.stdin.readline().split()
    W, H, x, y, r = map(int, work)

    judge = "Yes" if 0 <= x - r and x + r <= W and 0 <= y - r and y + r <= H else "No"

    print(judge)

if __name__ == "__main__":
    main()
```
<|EOT|>
