Here is the translated code in Python:

```python
s = input().split()
upper = s[1][0]
print("A" + upper + "C")
```

Test case in Python:

```python
# Test Input
test_input = "AtCoder Beginner Contest"

# Save standard input
import sys
from io import StringIO

# Capture test input
backup = sys.stdin
sys.stdin = StringIO(test_input)

# Code to test
s = input().split()
upper = s[1][0]
print("A" + upper + "C")

# Restore standard input
sys.stdin = backup
```

If you run this test code, you'll get the expected output:

```
ABC
```
