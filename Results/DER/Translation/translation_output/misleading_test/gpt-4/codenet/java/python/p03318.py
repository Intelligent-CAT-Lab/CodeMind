Certainly! The Java code provided calculates and prints the first K numbers of a special sequence that reduces a quotient of the number and the sum of its digits when multiplied by ten. Below is the corresponding Python code that performs the same task:

```python
def calc(num):
    n = num
    sum_digits = 0
    while num != 0:
        sum_digits += num % 10
        num //= 10
    return n / sum_digits

def main():
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```

Now, if you provide the test input `10`, the Python script will produce the same expected output as the Java code:

```
1
2
3
4
5
6
7
8
9
19
-6
```

Please note that the last output `-6` is actually incorrect according to the Java code given. There seems to be a misunderstanding in the provided test case because the Java code will not print negative numbers as part of the sequence. It will stop after the 10th number (which is `19`). If you meant to have another test case or provide a different expected output, please let me know.
