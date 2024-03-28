```python
import re

def main():
    str_input = input().strip()
    print("A" if re.match("[A-Z]", str_input) else "a")

if __name__ == "__main__":
    main()
```
