System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
010

Expected output:
2


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


Answer:
```python
def p03482():
    s = input()
    ans = 0
    if len(s) % 2 == 0:
        if s[len(s) // 2 - 1]!= s[len(s) // 2]:
            print(len(s) // 2)
            return
        else:
            s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
            ans = 1
    mid = len(s) // 2
    for i in range(1, mid + 1):
        if i + mid == len(s) or s[mid + i]!= s[mid] or s[mid - i]!= s[mid]:
            ans += mid + i
            break
    print(ans)

p03482()
```

Test input:
```
010
```

Expected output:
```
2
```<|endoftext|>
