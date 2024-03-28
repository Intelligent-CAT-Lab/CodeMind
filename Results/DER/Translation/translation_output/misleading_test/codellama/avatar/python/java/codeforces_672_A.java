<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
952

Expected output:
-34

```
li = [ ]
ind = 0
for i in range ( 1 , 371 ) :
    temp = [ ]
    p , q = i , i
    count = 0
    while p != 0 :
        p //= 10
        count += 1
    if count == 1 :
        li . append ( i )
    if count == 2 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
li . pop ( )
li . pop ( )
n = int ( input ( ' ' ) )
print ( li [ n - 1 ] )


```
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int[] temp = new int[i];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            } else if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```
This code is a solution to the problem you provided. It uses the same logic as the Python code, but it is written in Java.

The code first creates an empty ArrayList called `li` and sets the index `ind` to 0. It then loops through the numbers from 1 to 371, and for each number `i`, it calculates the number of digits in `i` using the `count` variable.

If the number of digits is 1, the code adds `i` to the `li` ArrayList. If the number of digits is 2, the code creates an array called `temp` and adds the digits of `i` to it in reverse order. It then adds the contents of `temp` to the `li` ArrayList. If the number of digits is 3, the code creates an array called `temp` and adds the digits of `i` to it in reverse order. It then adds the contents of `temp` to the `li` ArrayList.

After the loop is finished, the code removes the last two elements from the `li` ArrayList using the `remove` method. It then prompts the user to enter a number `n` and prints the `n-1`th element of the `li` ArrayList.

I hope this helps! Let me know if you have any questions.</s>
