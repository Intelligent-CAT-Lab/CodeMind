

```
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c)),0.5));
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}
```


```

java code:

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
```
/Java/Java-Stdin-and-Stdout-I.md
# Java Stdin and Stdout I

In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

A sample test case is provided below:

Test input:
4
2
3
4
1

Expected output:
2
3
4
1

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(sc.nextInt());
        }
    }
}
```

# Java If-Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

```
if (condition) {
    // condition is true and execute this code
} else {
    // condition is false and execute this code
}
```

Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

A sample test case is provided below:

Test input:
3

Expected output:
Weird

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }else if(n%2==0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }else if(n%2==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }else if(n%2==0 && n>20){
            System.out.println("Not Weird");
        }
    }
}
```

# Java Stdin and Stdout II

In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

A sample test case is provided below:

Test input:
4
2
3
4
1

Expected output:
2
3
4
1

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(sc.nextInt());
        }
    }
}
```

# Java Output Formatting

In this challenge, you must read a number from stdin and then print it to stdout in a right justified manner. The number should be padded with zeroes so that the width of the field is the number of characters in the original number.

A sample test case is provided below:

Test input:
15

Expected output:
0000000015

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%0"+n+"d",n);
    }
}
```

# Java Loops I

In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to learn more.

A sample test case is provided below:

Test input:
2

Expected output:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
```

# Java Loops II

In this challenge, we're going to use loops to solve a math problem. Check out the Tutorial tab to learn more.

A sample test case is provided below:

Test input:
2
3

Expected output:
5
14

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int j=a;j<=b;j++){
                if(j%2!=0){
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
    }
}
```

# Java Datatypes

In this challenge, we learn about the basic data types of the Java language. Check out the Tutorial tab for learning materials and an instructional video!

A sample test case is provided below:

Test input:
1
1000000000000
100000
123456789123456789

Expected output:
java.lang.NumberFormatException: For input string: "1000000000000"
100000
123456789123456789

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt
