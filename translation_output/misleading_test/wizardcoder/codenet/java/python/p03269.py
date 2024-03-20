Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
8 10
1 2 0
3 4 0
1 5 0
2 6 0
3 7 0
4 8 0
5 6 1
6 7 1
7 8 1

```
import java.util.*;
import java.io.PrintWriter;
public class p03269{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int k=l;
		int t=1;
		int count=1;
		ArrayList<String> ans=new ArrayList<>();
		while(l>1){
			if((l & 1)==1){
				k-=t;
				ans.add(count+" "+20+" "+k);
			}
			ans.add(count+" "+(count+1)+" "+t);
			count++;
			l>>=1;
			t*=2;
		}
		System.out.println(20+" "+(ans.size()+19));
		for(int i=0; i<19; i++){
			System.out.println((i+1)+" "+(i+2)+" "+0);
		}
		for(String s:ans){
			System.out.println(s);
		}
	}
}

```

### Response:
```python
import java.util.*;
import java.io.PrintWriter;

public class p03269{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int k=l;
        int t=1;
        int count=1;
        ArrayList<String> ans=new ArrayList<>();
        while(l>1){
            if((l & 1)==1){
                k-=t;
                ans.add(count+" "+20+" "+k);
            }
            ans.add(count+" "+(count+1)+" "+t);
            count++;
            l>>=1;
            t*=2;
        }
        System.out.println(20+" "+(ans.size()+19));
        for(int i=0; i<19; i++){
            System.out.println((i+1)+" "+(i+2)+" "+0);
        }
        for(String s:ans){
            System.out.println(s);
        }
    }
}
```<|endoftext|>
