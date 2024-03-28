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

def main():
    insn = [int(x) for x in input().split()]
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d
    while a >= 0 or c >= 0:
        c -= b
        if c <= 0:
            print("Yes")
            return
        a -= d
        if a <= 0:
            print("No")
            return

if __name__ == "__main__":
    main()