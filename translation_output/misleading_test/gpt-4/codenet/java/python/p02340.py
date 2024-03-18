Here's the translated Python code for the Java code provided:

```python
def gcd(x, y):
    x = abs(x)
    y = abs(y)

    if x < y:
        x, y = y, x

    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def lcm(x, y):
    return (x * y) // gcd(x, y)

def get_num(tmp_str):
    return int(tmp_str)

def is_number(tmp_str):
    return tmp_str.isdigit()

class P02340:
    BIG_NUM = 2000000000
    MOD = 1000000007
    HUGE_NUM = 99999999999999999
    EPS = 0.000000001

    SIZE = 1005
    dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]

    def recursive(self, num_ball, num_box):
        if self.dp[num_ball][num_box] != -1:
            return self.dp[num_ball][num_box]

        if num_ball == 0:
            return 1
        elif num_box == 1:
            return 1

        ret = 0
        for next_box in range(1, num_box + 1):
            next_ball = num_ball - next_box
            if next_ball < 0:
                break

            ret += self.recursive(next_ball, next_box)
            ret %= self.MOD

        self.dp[num_ball][num_box] = ret
        return ret

if __name__ == "__main__":
    p02340_instance = P02340()
    
    num_ball, num_box = map(int, input().split())    
    print(p02340_instance.recursive(num_ball, num_box))
```

Keep in mind that unlike in Java (where arrays are used), in Python, we use lists, which are initialized differently. Also, Python does not require an explicit `static` keyword, and instance methods need `self` as the first parameter. 

Additionally, I merged the utility methods and the P02340 class for simplicity, given that Python does not use multiple public classes in a single file in the same way as Java. The original Java utility class methods can be called as standalone functions or be included as static methods within a class in Python. 

To execute the test case, you would run the script and type "5 3" in the command line, followed by pressing "Enter".
