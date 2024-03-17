<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
733035 244345 48869 1


```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```
[/INST]
```java
public class PrimeFactors {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
        System.out.println();
    }
}
```
This code takes an integer as input and prints out all of its prime factors in descending order.

For example, if the input is 733035, the output will be:

733035 244345 48869 1

The code works by iterating through the numbers from the input to 1, and checking if the input is divisible by each number. If it is, it prints out the number and updates the input to be the current number.

Note that this code assumes that the input is a positive integer. If the input is not a positive integer, the code will not work correctly.</s>
