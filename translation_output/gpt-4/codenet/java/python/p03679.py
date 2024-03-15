```python
import sys

def main():
    # Here your code !
    line = sys.stdin.readline()
    
    tmp_array = line.split()
    
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

Please note that in a typical Python script, you don't usually use `sys.stdin.readline()` to get input; instead, the `input()` function is commonly used. `sys.stdin.readline()` is shown here to more closely match the original Java code that explicitly reads from standard input. If you want a version using `input()`, please let me know!
