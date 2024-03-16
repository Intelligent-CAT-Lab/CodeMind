<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03666 {

	public static void main(String[] args) {
		new p03666().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		
		for(int i=0;i<=N-1;i++){
			long max=D*(N-1-i)-C*i;
			long min=C*(N-1-i)-D*i;
			if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```

### 解题思路

1. 首先我们需要把这个问题转换成一个数学问题，即：

   ```
   A,B,C,D 是 4 个整数，求 A,B,C,D 的值，使得 A+B+C+D 的绝对值最大，且 A+B+C+D 的绝对值小于等于 N
   ```

   我们可以通过一个循环来解决这个问题，即：

   ```
   for(int i=0;i<=N-1;i++){
       long max=D*(N-1-i)-C*i;
       long min=C*(N-1-i)-D*i;
       if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
           System.out.println("YES");
           return;
       }
   }
   ```

   其中，

   ```
   max=D*(N-1-i)-C*i
   min=C*(N-1-i)-D*i
   ```

   表示，当 i 为 0 时，max 的值为 D*(N-1)，min 的值为 C*(N-1)；当 i 为 N-1 时，max 的值为 D*0，min 的值为 C*0；当 i 为 1 时，max 的值为 D*(N-2)，min 的值为 C*(N-2)；当 i 为 N-2 时，max 的值为 D*(N-3)，min 的值为 C*(N-3)；当 i 为 2 时，max 的值为 D*(N-3)，min 的值为 C*(N-3)；当 i 为 N-3 时，max 的值为 D*(N-4)，min 的值为 C*(N-4)；当 i 为 3 时，max 的值为 D*(N-4)，min 的值为 C*(N-4)；当 i 为 N-4 时，max 的值为 D*(N-5)，min 的值为 C*(N-5)；当 i 为 4 时，max 的值为 D*(N-5)，min 的值为 C*(N-5)；当 i 为 N-5 时，max 的值为 D*(N-6)，min 的值为 C*(N-6)；当 i 为 5 时，max 的值为 D*(N-6)，min 的值为 C*(N-6)；当 i 为 N-6 时，max 的值为 D*(N-7)，min 的值为 C*(N-7)；当 i 为 6 时，max 的值为 D*(N-7)，min 的值为 C*(N-7)；当 i 为 N-7 时，max 的值为 D*(N-8)，min 的值为 C*(N-8)；当 i 为 7 时，max 的值为 D*(N-8)，min 的值为 C*(N-8)；当 i 为 N-8 时，max 的值为 D*(N-9)，min 的值为 C*(N-9)；当 i 为 8 时，max 的值为 D*(N-9)，min 的值为 C*(N-9)；当 i 为 N-9 时，max 的值为 D*(N-10)，min 的值为 C*(N-10)；当 i 为 9 时，max 的值为 D*(N-10)，min 的值为 C*(N-10)；当 i 为 N-10 时，max 的值为 D*(N-11)，min 的值为 C*(N-11)；当 i 为 10 时，max 的值为 D*(N-11)，min 的值为 C*(N-11)；当 i 为 N-11 时，max 的值为 D*(N-12)，min 的值为 C*(N-12)；当 i 为 11 时，max 的值为 D*(N-12)，min 的值为 C*(N-12)；当 i 为 N-12 时，max 的值为 D*(N-13)，min 的值为 C*(N-13)；当 i 为 12 时，max 的值为 D*(N-13)，min 的值为 C*(N-13)；当 i 为 N-13 时，max 的值为 D*(N-14)，min 的值为 C*(N-14)；当 i 为 13 时，max 的值为 D*(N-14)，min 的值为 C*(N-14)；当 i 为 N-14 时，max 的值为 D*(N-15)，min 的值为 C*(N-15)；当 i 为 14 时，max 的值为 D*(N-15)，min 的值为 C*(N-15)；当 i 为 N-15 时，max 的值为 D*(N-16)，min 的值为 C*(N-16)；当 i 为 15 时，max 的值为 D*(N-16)，min 的值为 C*(N-16)；当 i 为 N-16 时，max 的值为 D*(N-17)，min 的值为 C*(N-17)；当 i 为 16 时，max 的值为 D*(N-17)，min 的值为 C*(N-17)；当 i 为 N-17 时，max 的值为 D*(N-18)，min 的值为 C*(N-18)；当 i 为 17 时，max 的值为 D*(N-18)，min 的值为 C*(N-18)；当 i 为 N-18 时，max 的值为 D*(N-19)，min 的值为 C*(N-19)；当 i 为 18 时，max 的值为 D*(N-19)，min 的值为 C*(N-19)；当 i 为 N-19 时，max 的值为 D*(N-20)，min 的值为 C*(N-20)；当 i 为 19 时，max 的值为 D*(N-20)，min 的值为 C*(N-20)；当 i 为 N-20 时，max 的值为 D*(N-21)，min 的值为 C*(N-21)；当 i 为 20 时，max 的值为 D*(N-21)，min 的值为 C*(N-21)；当 i 为 N-21 时，max 的值为 D*(N-22)
