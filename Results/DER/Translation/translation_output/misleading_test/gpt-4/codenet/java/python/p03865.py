Below is the provided Java code translated to Python:

```python
def main():
    s = input()
    
    a = len(s)
    
    flag = True
    
    if s[0] == s[a-1]:
        if a % 2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a % 2 == 1:
            flag = True
        else:
            flag = False
    
    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()
```

You can test this Python code with the input "aba" and expect the output "Second".
