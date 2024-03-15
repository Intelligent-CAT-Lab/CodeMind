```python
def main():
    a = []
    for i in range(3):
        a.append(int(input()))
    
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")

if __name__ == "__main__":
    main()
```
