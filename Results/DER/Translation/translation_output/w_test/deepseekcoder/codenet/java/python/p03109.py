<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heisei


```
import java.util.Scanner;
class p03109{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}

```

### Response:
```python
def p03109(date):
    time = date.split("/")[2]
    if time[0] == '1' or int(time[1]) > 4:
        return "TBD"
    else:
        return "Heisei"

print(p03109("2019/04/30"))
```

This Python function takes a string as input, splits it into a list of strings using the "/" as a delimiter, and then checks the third element of the list (which represents the day) to determine whether the year is Heisei or TBD.
<|EOT|>
