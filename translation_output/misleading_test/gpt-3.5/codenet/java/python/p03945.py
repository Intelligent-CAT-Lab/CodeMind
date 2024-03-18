```python
def main():
    s = input()
    str_arr = [s[i] for i in range(len(s))]
    counter = 0
    
    for i in range(len(str_arr) - 1):
        if str_arr[i] != str_arr[i+1]:
            counter += 1
    
    print(counter)

if __name__ == "__main__":
    main()
```
