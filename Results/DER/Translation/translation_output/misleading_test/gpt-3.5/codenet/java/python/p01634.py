```python
import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        if not line:
            break

        c1, c2, c3 = 0, 0, 0
        if len(line) < 6:
            print("INVALID")
        else:
            for c in line:
                if c.isnumeric():
                    c1 += 1
                elif c.isalpha():
                    if c.isupper():
                        c2 += 1
                    else:
                        c3 += 1

            if c1 > 0 and c2 > 0 and c3 > 0:
                print("VALID")
            else:
                print("INVALID")

if __name__ == "__main__":
    main()
```
```
