<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    res = input()
    day = len(res)
    nday = 15 - day
    cnt = res.count('o')

    if (day <= 7) or ((day >= 8) and ((cnt + nday) >= 8)):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
<|EOT|>
