Here is the Python equivalent of the Java code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    square = n * n
    odd = [i for i in range(1, square + 1, 2)]
    even = [i for i in range(2, square + 1, 2)]
    
    loop = square // n
    div = loop // 2
    
    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                sys.stdout.write(str(odd.pop(0)) + " " + str(even.pop(-1)) + " ")
            else:
                sys.stdout.write(str(even.pop(0)) + " " + str(odd.pop(-1)) + " ")
        sys.stdout.write("\n")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates two lists of odd and even numbers, and then prints out the numbers in a specific pattern. The `pop` method is used to remove and return the last element of the list, which is equivalent to the last element of the array in Java. The `write` method is used to write to the standard output, which is equivalent to `System.out.println` in Java.
