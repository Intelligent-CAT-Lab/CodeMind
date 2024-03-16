```python
import sys

try:
    input_string = list(input().strip())
    remove_duplication = set(input_string)

    ans = "no"
    if len(input_string) == len(remove_duplication):
        ans = "yes"

    print(ans)

except (EOFError, ValueError):
    sys.exit(0)
except Exception as e:
    print(e)
    sys.exit(0)
```
