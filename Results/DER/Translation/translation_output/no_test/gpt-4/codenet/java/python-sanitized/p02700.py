import sys

def main():
    insn = get_array_int()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return

def ff(combination_sum):
    return combination_sum % (10**9 + 7)

def combination_sum(n, coins, l):
    if n < 0:
        return -1
    if n == 0:
        return l
    
    coin_count = float('inf')
    for coin in coins:
        curr_coin = combination_sum(n - coin, coins, l + 1)
        if curr_coin == -1:
            continue
        if curr_coin < coin_count:
            coin_count = curr_coin
    if coin_count == float('inf'):
        return -1
    return coin_count

def get_array_int():
    try:
        string = sys.stdin.readline().strip().split()
        array = [int(i) for i in string]
        return array
    except Exception as e:
        return [0, 0]

def get_int():
    try:
        return int(sys.stdin.readline().strip())
    except Exception as e:
        return 0

def get_long_input():
    try:
        return int(sys.stdin.readline().strip())
    except Exception as e:
        return 0

def get_long_array_input():
    try:
        string = sys.stdin.readline().strip().split()
        array = [int(i) for i in string]
        return array
    except Exception as e:
        return [0, 0]

if __name__ == "__main__":
    main()