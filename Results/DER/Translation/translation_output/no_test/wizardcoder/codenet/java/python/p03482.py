Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
 
class p03482{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int ans = 0;
    if(S.length()%2==0){
      if(S.charAt(S.length() /2 -1)!= S.charAt(S.length() /2)){
        System.out.println(S.length() /2);
        return;
      }else{
        S = S.substring(0, S.length() /2) + S.substring(S.length() /2 +1);
        ans =1;
      }
    }
    int mid = S.length() /2;
    for(int i=1;i+mid <= S.length();++i){
      if(i+mid==S.length() || S.charAt(mid+i)!=S.charAt(mid) || S.charAt(mid-i)!=S.charAt(mid)){
        ans += mid + i;
        break;
      }
    }
    System.out.println(ans);
  }
}
      
```

### Response:
```python
import java.util.Scanner;

class p03482:
    def main(self):
        scan = Scanner(System.in)
        S = scan.next()
        ans = 0
        if S.length() % 2 == 0:
            if S.charAt(S.length() // 2 - 1)!= S.charAt(S.length() // 2):
                print(S.length() // 2)
                return
            else:
                S = S[:S.length() // 2] + S[S.length() // 2 + 1:]
                ans = 1
        mid = S.length() // 2
        for i in range(1, S.length() - mid + 1):
            if i + mid == S.length() or S[mid + i]!= S[mid] or S[mid - i]!= S[mid]:
                ans += mid + i
                break
        print(ans)

p03482().main()
```<|endoftext|>
