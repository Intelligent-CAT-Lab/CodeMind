```python
def main():
    s = input()

    print((len(s) - s.replace("o", "").count("o"))*100+700)

if __name__ == "__main__":
    main()
```
