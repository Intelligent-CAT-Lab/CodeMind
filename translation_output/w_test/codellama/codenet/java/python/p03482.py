<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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

def main():
    s = sys.stdin.readline().strip()
    ans = 0
    if len(s) % 2 == 0:
        if s[len(s) // 2 - 1] != s[len(s) // 2]:
            print(len(s) // 2)
            return
        else:
            s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
            ans = 1
    mid = len(s) // 2
    for i in range(1, len(s) - mid + 1):
        if i + mid == len(s) or s[mid + i] != s[mid] or s[mid - i] != s[mid]:
            ans += mid + i
            break
    print(ans)

if __name__ == "__main__":
    main()
```
This is the Python code for the given Java code. The code first reads a string from standard input using `sys.stdin.readline()`. It then checks if the length of the string is even and if the middle character is not the same as the character at the end of the string. If these conditions are met, it prints the length of the string divided by 2 and returns.

Otherwise, it calculates the middle index of the string and starts a loop that iterates from 1 to the length of the string minus the middle index. For each iteration, it checks if the character at the current index is the same as the character at the middle index, and if the character at the current index plus the middle index is the same as the character at the middle index. If these conditions are not met, it adds the current index to the answer and breaks the loop.

Finally, it prints the answer and returns.</s>
