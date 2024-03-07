<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys
from math import sqrt

def solve():
    n = int(input())

    print('{}: '.format(n), end='')
    print(*prime_factorization(n))

def prime_factorization(n):
    if n < 2:
        return [n]

    res = []
    lim = int(sqrt(n))

    for p in range(2, lim + 1):
        while n % p == 0:
            res.append(p)
            n //= p

    if n > 1:
        res.append(n)

    return res

if __name__ == '__main__':
    solve()

Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.lang.Math;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(n + ": ");
        System.out.print(primeFactorization(n));
    }

    public static String primeFactorization(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }

        String res = "";
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res += p + " ";
                n /= p;
            }
        }

        if (n > 1) {
            res += n;
        }

        return res;
    }
}

This is the Java code for the same program. It uses the same logic as the Python code, but with some differences in syntax and data types.

The `Scanner` class is used to read input from the user, and the `Math` class is used to calculate the square root of the input number. The `String` class is used to concatenate the prime factors.

The `main` method is the entry point of the program, and it reads the input from the user using the `Scanner` class. It then calls the `primeFactorization` method with the input number as an argument, and prints the result to the console.

The `primeFactorization` method takes an integer as an argument, and it returns a string that contains the prime factors of the input number. It uses a similar logic as the Python code, but with some differences in syntax and data types.

The method first checks if the input number is less than 2, and if it is, it returns the number as a string. Otherwise, it initializes an empty string `res` and calculates the square root of the input number using the `Math` class.

It then loops through the numbers from 2 to the square root of the input number, and for each number `p`, it checks if the input number is divisible by `p`. If it is, it appends `p` to the `res` string, and divides the input number by `p`.

Finally, if the input number is greater than 1, it appends the input number to the `res` string. The method then returns the `res` string.</s>
