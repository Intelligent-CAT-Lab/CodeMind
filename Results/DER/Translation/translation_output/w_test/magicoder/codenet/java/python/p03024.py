<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxoxoxoxoxoxox

Expected output:
YES


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

@@ Response
```python
# Python code

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

This Python code does the same thing as the Java code. It reads a string from the user, calculates the number of 'o's in the string, and then checks if the length of the string is less than or equal to 7 or if the sum of the length of the string and the number of 'o's is greater than or equal to 8. If either of these conditions is true, it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
