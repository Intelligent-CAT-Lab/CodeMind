Here is the Python equivalent of the Java code:

```python
import sys

def main():
    while True:
        try:
            N, x = map(int, sys.stdin.readline().split())
            if x == 1 or x == 2 * N - 1:
                print("No")
                break
            print("Yes")
            low = x - 1
            high = x + 1
            deq = []
            deq.append(x)
            while low != 0 or high != 2 * N:
                if low == 0:
                    deq.insert(0, high)
                    deq.append(high + 1)
                    high += 2
                elif high == 2 * N:
                    deq.append(low)
                    deq.insert(0, low - 1)
                    low -= 2
                else:
                    deq.insert(0, low)
                    low--
                    deq.append(high)
                    high++
            for s in deq:
                print(s)
        except:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, processes it, and prints the output to the standard output. The main function is the entry point of the program. It reads the input, processes it, and prints the output. The while loop in the main function is used to read multiple test cases. The try-except block is used to handle the end of input.
