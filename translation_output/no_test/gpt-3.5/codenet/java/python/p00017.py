```python
def compute():
    while True:
        try:
            S = input()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S[j]
                    if 'a' <= c <= 'z':
                        converted += chr(ord(c) + i if ord(c) + i <= ord('z') else ord(c) + i - 26)
                    else:
                        converted += c
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break
        except EOFError:
            break

if __name__ == "__main__":
    compute()
```  
