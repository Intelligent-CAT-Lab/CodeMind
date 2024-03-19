<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
-76

```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] a = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```
This code first takes input from the user and splits it into an array of strings using the `split()` method. Then, it converts each string to an integer using the `parseInt()` method and stores it in an array of integers. Finally, it iterates through the array of integers and checks if any of them is equal to 0. If it finds one, it prints its index (which is one more than the index in the original array) and breaks out of the loop.</s>
