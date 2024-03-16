<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

### Response:
```python
import sys

def main():
    S = sys.stdin.readline().strip()
    ans = 0
    if len(S) % 2 == 0:
        if S[len(S) // 2 - 1] != S[len(S) // 2]:
            print(len(S) // 2)
            return
        else:
            S = S[:len(S) // 2] + S[len(S) // 2 + 1:]
            ans = 1
    mid = len(S) // 2
    for i in range(1, mid + 1):
        if i + mid == len(S) or S[mid + i] != S[mid] or S[mid - i] != S[mid]:
            ans += mid + i
            break
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, checks if the string length is even, and if so, removes the middle character if it is the same as the character before it. Then it counts the number of equal characters on both sides of the middle character and prints the result.
<|EOT|>
