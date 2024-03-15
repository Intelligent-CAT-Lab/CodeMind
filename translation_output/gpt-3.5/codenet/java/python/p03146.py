```python
def main():
    s = int(input())
    set_ = set()
    set_.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            print(i)
            return
        else:
            set_.add(s)

if __name__ == "__main__":
    main()
```
