Below is the Java code translated into Python:

```python
MOD = 1000000007
SIZE = 1005
dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]

def recursive(num_ball, num_box):
    if dp[num_ball][num_box] != -1:
        return dp[num_ball][num_box]
    
    if num_ball == 0:
        return 1
    elif num_box == 1:
        return 1
    
    ret = 0
    for next_box in range(1, num_box + 1):
        next_ball = num_ball - next_box
        if next_ball < 0:
            break
        
        ret += recursive(next_ball, next_box)
        ret %= MOD
    
    dp[num_ball][num_box] = ret
    return ret

def gcd(x, y):
    x = abs(x)
    y = abs(y)
    
    while y:
        x, y = y, x % y
        
    return x

def lcm(x, y):
    return (x * y) // gcd(x, y)

def getNUM(tmp_str):
    return int(tmp_str)

def isNumber(tmp_str):
    return tmp_str.isdigit()

if __name__ == '__main__':
    num_ball, num_box = map(int, input().split())
    print(recursive(num_ball, num_box))
```

A sample test case using the provided input:

Test Input:
```
5 3
```

Expected Output:
```
5
```

To test this Python code, you can copy and run it with the input provided to obtain the expected output. The utility functions (gcd, lcm, getNUM, isNumber) are translated as plain functions, but they are not used within the scope of the `recursive` function and the main part of this code.
