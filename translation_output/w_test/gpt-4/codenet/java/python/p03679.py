Below is the translated Python code:

```python
def main():
    line = input()
    
    tmp_array = line.split(" ")
    
    over_limit = int(tmp_array[0])
    prev_day = int(tmp_array[1])
    over_day = int(tmp_array[2])
    
    if prev_day >= over_day:
        print("delicious")
    elif prev_day + over_limit < over_day:
        print("dangerous")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

You can test this code with the provided test case.

Test input:
```
4 3 6
```

Expected output:
```
safe
```
