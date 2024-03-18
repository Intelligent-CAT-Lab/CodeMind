Below is the translated Python code from the provided Java code:

```python
def main():
    s = input()

    if len(s) < 4:
        print("No")
        return
    
    if s[:4] == "YAKI":
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

To run this code with the test input "YAKINIKU", simply input the string "YAKINIKU" when prompted:

```
YAKINIKU
```

The expected output would be:

```
Yes
```
