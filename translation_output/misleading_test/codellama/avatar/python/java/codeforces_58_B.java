<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
732989 244387 48927 23

```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `for` loop iterates from `a` to `0` in decreasing order.
* The `if` statement checks if `a` is divisible by `i`. If it is, the `print()` method is used to print `i` followed by a space.
* The `a` variable is updated to `i` after the `print()` method is called.
* The `end` parameter of the `print()` method is set to `" "` to add a space after each number.

Sample test case:

Input:
733035

Output:
732989 244387 48927 23

Note: The output may vary depending on the input.</s>
