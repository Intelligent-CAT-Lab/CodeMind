<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
952

Expected output:
3


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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

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
        System.out.println(li.get(n - 1));
    }
}
```
This code is a bit more complex than the Python code, but it still follows the same logic. We first create an `ArrayList` to store the numbers, and then we iterate through the numbers from 1 to 371. For each number, we calculate the number of digits it has, and then we add it to the `ArrayList` accordingly.

The `if` statements are used to handle the different cases for the number of digits. If the number has 1 digit, we simply add it to the `ArrayList`. If it has 2 digits, we add the digits in reverse order to the `ArrayList`. If it has 3 digits, we add the digits in reverse order to the `ArrayList`, and then we add the number itself to the `ArrayList`.

After we have added all the numbers to the `ArrayList`, we remove the last two elements, which are the numbers 371 and 370. Finally, we print the `n`th element of the `ArrayList`, which is the number we are looking for.</s>
