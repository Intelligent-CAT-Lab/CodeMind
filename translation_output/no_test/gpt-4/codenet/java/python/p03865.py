Here's the Python translation for the provided Java code:

```python
if __name__ == "__main__":
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
```
