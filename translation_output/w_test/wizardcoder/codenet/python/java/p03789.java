Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
80

Expected output:
2


```
n=list(input())
n.reverse()
lb,ub=0,len(n)
def check(x):
	g=0
	for i in n:
		x-=(x+g-int(i))%10
		if x<0:
			break
		g=(x+g)//10
	return x>=0
while ub-lb>1:
	mid=(lb+ub)//2
	if check(9*mid):
		ub=mid
	else:
		lb=mid
print(ub)
```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        n=new StringBuilder(n).reverse().toString();
        int lb=0,ub=n.length();
        while(ub-lb>1){
            int mid=(lb+ub)/2;
            if(check(n,mid)){
                ub=mid;
            }else{
                lb=mid;
            }
        }
        System.out.println(ub);
    }
    public static boolean check(String n,int x){
        int g=0;
        for(int i=0;i<n.length();i++){
            x-=(x+g-n.charAt(i)-48)%10;
            if(x<0){
                return false;
            }
            g=(x+g)/10;
        }
        return x>=0;
    }
}
```<|endoftext|>
