Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

### Response:
```python
import java.util.Scanner;

class p00301:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        a = [0] * 15
        i = 0
        while n > 0:
            a[i] = (n + 1) % 3 - 1
            n = (n - a[i]) // 3
            i += 1
        while i > 0:
            print((a[i - 1] == 0) and "0" or (a[i - 1] > 0) and "+" or "-", end="")
            i -= 1
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p00301` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create a new instance of the `Scanner` class to read input from the user.
- We read the input integer `n` from the user using the `nextInt()` method of the `Scanner` class.
- We create an array `a` of size 15 to store the values of the digits.
- We initialize a variable `i` to 0 to keep track of the index of the current digit.
- We use a `while` loop to calculate the digits of the number `n`.
- Inside the loop, we calculate the value of the current digit using the formula `(n+1)%3-1`.
- We subtract the value of the current digit from `n` to get the next digit.
- We increment the value of `i` to keep track of the index of the current digit.
- After the loop, we use another `while` loop to print the digits of the number.
- Inside the loop, we use an `if-else` statement to print the sign of the current digit.
- We use the `end` parameter of the `print` function to print the digits and signs in the same line.
- We decrement the value of `i` to move to the previous digit.<|endoftext|>
