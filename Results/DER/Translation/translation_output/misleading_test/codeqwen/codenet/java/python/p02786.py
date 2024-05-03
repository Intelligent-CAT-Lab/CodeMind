Here is the Python equivalent of the Java code:

```python
class p02786:
    def main(self):
        h = int(input())
        if h == 1:
            print(1)
        else:
            count = 1
            sum = 0
            while h > 1:
                h = h // 2
                sum += 2 ** count
                count += 1
            print(sum + 1)


if __name__ == "__main__":
    obj = p02786()
    obj.main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's 1, and if so, prints 1. If it's not 1, it calculates the sum of 2 raised to the power of each integer from 1 to the number of times the number can be divided by 2, and then adds 1 to the sum. Finally, it prints the sum.
