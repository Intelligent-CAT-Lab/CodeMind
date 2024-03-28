<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
53

```
import java.util.Arrays;
import java.util.Scanner;

public class p03352 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1, 4, 8, 16, 32, 64, 128, 256, 512,  9, 27, 81, 243, 729,  16, 64, 256, 1024, 25, 125, 625,  36, 216,  49, 343,  64, 512,  81, 729,  100, 1000, 121,  144,  169,  196,  225,  256,  289,  324,  361,  400, 441, 484,  529,  576,  625,  676,  729,  784,  841, 900,  961};
        Arrays.sort(num);
        int X = sc.nextInt();
        int max = -1;
        for(int i = num.length; i > 0; i--){
            int n = num[i - 1];
            if(n <= X){
                max = Math.max(max, n);
                break;
            }
        }
        System.out.println(max);
    }
}

```
[/INST]
```python
import math

def find_closest_number(nums, target):
    return min(nums, key=lambda x: abs(x - target))

def main():
    nums = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961]
    target = int(input("Enter a number: "))
    closest_number = find_closest_number(nums, target)
    print(closest_number)

if __name__ == "__main__":
    main()
```
This code first defines a function `find_closest_number` that takes two arguments: a list of numbers `nums` and a target number `target`. The function returns the closest number in `nums` to `target`.

The `main` function first prompts the user to enter a number, and then calls the `find_closest_number` function with the list of numbers and the target number as arguments. The result is then printed to the console.

Note that this code assumes that the list of numbers is already sorted in ascending order. If the list is not sorted, you will need to sort it before calling the `find_closest_number` function.</s>
