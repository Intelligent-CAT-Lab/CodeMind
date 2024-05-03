Here is the Python equivalent of the Java code:

```python
class p03264:
    def main(self):
        n = int(input())
        
        o = 0
        e = 0
        
        for i in range(1, n+1):
            if i % 2 == 1:
                o += 1
            else:
                e += 1
        print(o*e)

p03264().main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, counts the number of odd and even numbers from 1 to the input number, and then prints the product of the counts of odd and even numbers.
