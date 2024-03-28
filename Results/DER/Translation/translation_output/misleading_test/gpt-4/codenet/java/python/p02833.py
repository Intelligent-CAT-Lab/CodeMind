Below is the translated version of the provided Java code into Python:

```python
import sys

class TaskX:
    def solve(self, n):
        if n % 2 == 1:
            return 0

        ans = 0
        base = 10
        while True:
            if base > n:
                break
            ans += n // base
            base *= 5
        return ans

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    task = TaskX()
    result = task.solve(n)
    print(result)
```

This Python code reads an integer from stdin, checks if it’s even, and then counts the number of trailing zeros in its factorial by dividing the number by increasing powers of 5. It then prints out the result.

To test the program with the input "12" and expect the output "30", you can save the Python code to a file and then run it, providing the input either through a file redirection or via the command line.
