<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
010

Expected output:
13

```
import java.util.Scanner;
 
class p03482{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int ans = 0;
    if(S.length()%2==0){
      if(S.charAt(S.length() /2 -1) != S.charAt(S.length() /2)){
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
[/INST]
```python
import sys

def solve(s):
    if len(s) % 2 == 0:
        if s[len(s) // 2 - 1] != s[len(s) // 2]:
            return len(s) // 2
        else:
            s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
    mid = len(s) // 2
    for i in range(1, len(s) - mid + 1):
        if i + mid == len(s) or s[mid + i] != s[mid] or s[mid - i] != s[mid]:
            return mid + i
    return mid + len(s) - mid

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))
```
This code first checks if the length of the input string is even or odd. If it's even, it checks if the middle two characters are the same, and if they are, it removes the middle two characters and recursively calls the `solve` function with the updated string. If the length is odd, it sets the middle index to `len(s) // 2` and starts a loop that iterates from 1 to `len(s) - mid + 1`. Inside the loop, it checks if the current index plus the middle index is equal to the length of the string, or if the character at the current index plus the middle index is not equal to the character at the middle index, or if the character at the current index minus the middle index is not equal to the character at the middle index. If any of these conditions are true, it returns the current index plus the middle index. If the loop completes without returning, it returns the middle index plus the length of the string minus the middle index.</s>
