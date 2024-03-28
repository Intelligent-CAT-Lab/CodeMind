Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

class p03109:
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1' or int(time.charAt(1))>4):
            System.out.println("TBD");
        else:
            System.out.println("Heisei");
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p03109` with a `main` method that takes input from the user using the `Scanner` class.
- We read the input string using the `next()` method of the `Scanner` class and store it in the `time` variable.
- We use the `charAt()` method to extract the first two characters of the `time` string and check if they are equal to `'1'` or if the second character is greater than `'4'` (which is the ASCII value of `'5'`).
- If the condition is true, we print `"TBD"`. Otherwise, we print `"Heisei"`.<|endoftext|>
