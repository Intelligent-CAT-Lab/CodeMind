<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String ans = "Yes";


        if(S.length() % 2 == 1){
            ans = "No";
        } else {
            for(int i=0;i < S.length()/2;i+=2){
                if(!S.substring(i,i+2).equals("hi")){
                  ans = "No";
                }
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

    ans = "Yes"

    if len(S) % 2 == 1:
        ans = "No"
    else:
        for i in range(0, len(S)//2, 2):
            if S[i:i+2] != "hi":
                ans = "No"

    print(ans)

if __name__ == "__main__":
    main()
```
<|EOT|>
