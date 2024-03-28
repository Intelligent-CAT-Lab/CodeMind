Here's the translated Python code:
```python
def p02406(x):
    if 3 <= x <= 10000:
        output_list = []
        count = 0
        a = 1
        while count < x:
            b = a // 10
            if a % 3 == 0:
                output_list.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        output_list.append(a)
                        break
                    b //= 10
            a += 1
            count += 1
        return ' '.join(map(str, output_list))

# Test the function
if __name__ == "__main__":
    test_input = int(input("Enter a number: "))
    result = p02406(test_input)
    print(result)
```

When you run this Python program, you can input '30' to test the function with the given sample test case. It should output the expected result: `3 6 9 12 13 15 18 21 23 24 27 30`.
