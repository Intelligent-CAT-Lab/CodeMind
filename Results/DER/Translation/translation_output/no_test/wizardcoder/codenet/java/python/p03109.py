Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    def main(self):
        scn = Scanner(System.in)
        time = scn.next().substring(5)
        if time.charAt(0) == '1' or Character.getNumericValue(time.charAt(1)) > 4:
            print("TBD")
        else:
            print("Heisei")

p03109().main()
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p03109` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create an object of the `Scanner` class and read the input string using the `next()` method.
- We then extract the substring starting from index 5 using the `substring()` method and store it in the `time` variable.
- We check if the first character of the `time` string is '1' or if the second character of the `time` string is greater than 4. If either of these conditions is true, we print "TBD". Otherwise, we print "Heisei".
- Finally, we call the `main` method of the `p03109` class to run the program.<|endoftext|>
