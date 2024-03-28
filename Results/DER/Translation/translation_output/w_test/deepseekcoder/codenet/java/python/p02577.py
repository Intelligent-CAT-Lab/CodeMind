<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```

### Response:
```python
def p02577(s):
    c = 0
    for i in s:
        c += int(i)
    if c % 9 == 0:
        return "Yes"
    else:
        return "No"

print(p02577("123456789"))
```

This Python function takes a string as input, calculates the sum of its digits, and checks if the sum is divisible by 9. If it is, it returns "Yes"; otherwise, it returns "No". The test case "123456789" should return "Yes".
<|EOT|>
