```python
import sys

def solve():
    s = next_input()
    if s[-1] == '?':
        s = s[:-1]
        sum_value = 0
        for i in range(len(s)):
            n = 11 - i
            q = 0
            p = int(s[i])
            if 1 <= n <= 6:
                q = n + 1
            else:
                q = n - 5
            sum_value += q * p
        sum_value %= 11
        if sum_value <= 1:
            sum_value = 0
        else:
            sum_value = 11 - sum_value
        print(sum_value)
        
    else:
        check = int(s[-1])
        cnt = 0
        ans = 0
        for j in range(10):
            sum_value = 0
            for i in range(len(s)-1):
                n = 11 - i
                q = 0
                if s[i] == '?':
                    p = j
                else:
                    p = int(s[i])
                    
                if 1 <= n <= 6:
                    q = n + 1
                else:
                    q = n - 5
                sum_value += q * p
                
            sum_value %= 11
            if sum_value <= 1:
                sum_value = 0
            else:
                sum_value = 11 - sum_value
            if check == sum_value:
                cnt += 1
                ans = j

        if cnt == 1:
            print(ans)
        else:
            print("MULTIPLE")

def next_input():
    return sys.stdin.readline().strip()

if __name__ == "__main__":
    solve()

```

