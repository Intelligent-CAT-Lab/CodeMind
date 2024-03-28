Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxoxoxoxoxoxox

Expected output:
auS

```
import java.util.*;
class p03024{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String res = sc.next();
        int day = res.length();
        int nday = 15-day;
        int cnt = 0;
        for(int i = 0;i < day;i++){
            char r = res.charAt(i);
            if(r == 'o')
            cnt++;
        }
        if((day <= 7)||((day >= 8)&&((cnt+nday) >= 8))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
```

### Response:
```python
import java.util.*;
class p03024:
    def main(self):
        sc = Scanner(System.in)
        res = sc.next()
        day = len(res)
        nday = 15-day
        cnt = 0
        for i in range(day):
            r = res[i]
            if r == 'o':
                cnt += 1
        if day <= 7 or (day >= 8 and cnt+nday >= 8):
            print("YES")
        else:
            print("NO")
```<|endoftext|>
