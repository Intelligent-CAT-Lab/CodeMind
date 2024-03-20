

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int start = -1;
        String letter = "";
        while (true) {
            if (sentence.charAt(start) != 'Â' && sentence.charAt(start) != '?') {
                letter = String.valueOf(sentence.charAt(start));
                break;
            }
            start--;
        }
        if (letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u") || letter.toLowerCase().equals("y")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                current += s.charAt(i);
            } else {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length() - 1);
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}

```


```

## 2.

Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print:

```
Number of times bob occurs is: 2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == 'bob':
        count += 1
print('Number of times bob occurs is:', count)

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

```python
s = input()
longest = ''
current = ''
for i in range(len(s) - 1):
    if s[i] <= s[i + 1]:
        current += s[i]
    else:
        current += s[i]
        if len(current) > len(longest):
            longest = current
        current = ''
current += s[len(s) - 1]
if len(current) > len(longest):
    longest = current
print('Longest substring in alphabetical order is:', longest)

```
/MITx-6.00.1x/Week 2/Problem Set 2/README.md
# Problem Set 2

## 1.

Write a program that calculates the minimum fixed monthly payment needed in order pay off a credit card balance within 12 months. By a fixed monthly payment, we mean a single number which does not change each month, but instead is a constant amount that will be paid each month.

In this problem, we will not be dealing with a minimum monthly payment rate.

The following variables contain values as described below:

```
balance - the outstanding balance on the credit card

annualInterestRate - annual interest rate as a decimal

The program should print out one line: the lowest monthly payment that will pay off all debt in under 1 year, for example:

Lowest Payment: 180

Assume that the interest is compounded monthly according to the balance at the end of the month (after the payment for that month is made). The monthly payment must be a multiple of $10 and is the same for all months. Notice that it is possible for the balance to become negative using this payment scheme, which is okay. A summary of the required math is found below:

Monthly interest rate = (Annual interest rate) / 12.0

Monthly unpaid balance = (Previous balance) - (Minimum fixed monthly payment)

Updated balance each month = (Monthly unpaid balance) + (Monthly interest rate x Monthly unpaid balance)

```

```python
balance = float(input())
annualInterestRate = float(input())
monthlyInterestRate = annualInterestRate / 12
monthlyPayment = 10
while balance > 0:
    balance = balance
    for i in range(12):
        balance = (balance - monthlyPayment) * (1 + monthlyInterestRate)
    if balance > 0:
        monthlyPayment += 10
        balance = balance
print('Lowest Payment:', monthlyPayment)

```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

```python
s = input()
longest = ''
current = ''
for i in range(len(s) - 1):
    if s[i] <= s[i + 1]:
        current += s[i]
    else:
        current += s[i]
        if len(current) > len(longest):
            longest = current
        current = ''
current += s[len(s) - 1]
if len(current) > len(longest):
    longest = current
print('Longest substring in alphabetical order is:', longest)

```
/MITx-6.00.1x/Week 2/Problem Set 2/ps2_3.py
s = input()
longest = ''
current = ''
for i in range(len(s) - 1):
    if s[i] <= s[i + 1]:
        current += s[i]
    else:
        current += s[i]
        if len(current) > len(longest):
            longest = current
        current = ''
current += s[len(s) - 1]
if len(current) > len(longest):
    longest = current
print('Longest substring in alphabetical order is:', longest)/MITx-6.00.1x/Week 2/Problem Set 2/ps2_1.py
s = input()
count = 0
for i in range(len(s) - 
