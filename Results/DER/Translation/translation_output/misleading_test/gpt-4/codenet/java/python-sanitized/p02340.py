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