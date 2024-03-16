```python
def main():
    S = input()
    correct = "CODEFESTIVAL2016"
    num = 0
    for i in range(16):
        if S[i] != correct[i]:
            num += 1
    print(num)

if __name__ == "__main__":
    main()
```
