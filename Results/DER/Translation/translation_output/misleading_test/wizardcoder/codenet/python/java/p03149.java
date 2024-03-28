Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YoES

```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] a = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        int[] b = {1,4,7,9};
        if(Arrays.equals(a,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
