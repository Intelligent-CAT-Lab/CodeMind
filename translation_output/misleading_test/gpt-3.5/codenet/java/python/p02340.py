```python
SIZE = 1005
dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]
MOD = 1000000007

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

input_data = input().split()
num_ball = int(input_data[0])
num_box = int(input_data[1])

print(recursive(num_ball, num_box))
```
``` 

Test input:  
5 3  

Expected output:  
61  
