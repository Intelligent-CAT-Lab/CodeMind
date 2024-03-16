```python
from collections import defaultdict

def main():
    res = defaultdict(int)
     
    while True:
        try:
            str_input = input()
            for c in str_input:
                if 65 <= ord(c) <= 90:
                    res[ord(c) - 65] += 1
                elif 97 <= ord(c) <= 122:
                    res[ord(c) - 97] += 1
        except EOFError:
            break
     
    for i in range(26):
        print(chr(i + 97) + " : " + str(res[i]))

if __name__ == "__main__":
    main()
```
