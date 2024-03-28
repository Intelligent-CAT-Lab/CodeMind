Below is the translated code from Java to Python:

```python
import sys

for line in sys.stdin:
    a, b = map(float, line.split())
    print((a * b) / 3.305785)
```
This code reads from standard input line by line, just like the Java version. For each line, it splits the line into two numbers, converts them to floats, multiplies them together, and then divides by 3.305785. It then prints the result.

To run a test with the input '15 25', you could save this script to a file (e.g., `p00094.py`), and then run it using `echo "15 25" | python p00094.py` in the command line, which should give you the expected output.
