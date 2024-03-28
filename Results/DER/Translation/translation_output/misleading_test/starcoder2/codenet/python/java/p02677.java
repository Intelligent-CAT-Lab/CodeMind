
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double l = H*360/12 + M*30/60;
        double s = M*360/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A,2) + Math.pow(B,2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```

## Question 2

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while(count < n){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Programming

## Week 1

### Day 1

- [x] [Introduction to Java](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Introduction%20to%20Java.md)
- [x] [Java Basics](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics.md)
- [x] [Java Basics - 2](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%202.md)
- [x] [Java Basics - 3](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%203.md)
- [x] [Java Basics - 4](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%204.md)
- [x] [Java Basics - 5](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%205.md)
- [x] [Java Basics - 6](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%206.md)
- [x] [Java Basics - 7](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%207.md)
- [x] [Java Basics - 8](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%208.md)
- [x] [Java Basics - 9](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%209.md)
- [x] [Java Basics - 10](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2010.md)
- [x] [Java Basics - 11](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2011.md)
- [x] [Java Basics - 12](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2012.md)
- [x] [Java Basics - 13](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2013.md)
- [x] [Java Basics - 14](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2014.md)
- [x] [Java Basics - 15](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2015.md)
- [x] [Java Basics - 16](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2016.md)
- [x] [Java Basics - 17](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2017.md)
- [x] [Java Basics - 18](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2018.md)
- [x] [Java Basics - 19](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2019.md)
- [x] [Java Basics - 20](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2020.md)
- [x] [Java Basics - 21](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2021.md)
- [x] [Java Basics - 22](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2022.md)
- [x] [Java Basics - 23](https://github.com/sudipto80/Java-Programming/blob/master/Week%201/Day%201/Java%20Basics%20-%2023.md)
- [x] [
